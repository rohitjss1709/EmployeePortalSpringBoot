package employee.portal.service;

import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employee.portal.model.Employee;
import employee.portal.model.vo.EmployeeResponseVo;
import employee.portal.model.vo.EmployeeSortRequestVo;
import employee.portal.model.vo.EmployeeSortResponseVo;
import employee.portal.model.vo.ResponseInfo;
import employee.portal.repository.EmployeeRepository;
import employee.portal.utils.Constants;
import employee.portal.utils.EmployeeComparatorHireDate;
import employee.portal.utils.EmployeeComparatorName;
import employee.portal.utils.EmployeeComparatorSalary;
import employee.portal.utils.SortTypeEnum;

/**
 * @author RohitSaini
 *
 * Service Class for Employee Portal
 */

@Service
public class EmployeeService {
	
	private static final Logger logger = LogManager.getLogger(EmployeeService.class);
	
	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeResponseVo getAllEmployees() {
		logger.info("EmployeeService.getAllEmployees() method execution started");
		EmployeeResponseVo employeeResponseVo = new EmployeeResponseVo();
		ResponseInfo info;
		try
		{
			employeeResponseVo.setEmployeeList(employeeRepository.findAll());
		}
		catch(Exception e){
			logger.error("Exception Occurred while fetching employee details from DB");
			info = new ResponseInfo(Constants.FAILURE_CODE, "Exception Occurred while fetching employee details from DB");
			employeeResponseVo.setResponseInfo(info);
			return employeeResponseVo;
		}
		if(employeeResponseVo.getEmployeeList()!=null 
				&& employeeResponseVo.getEmployeeList().size()>0)
		{
			info = new ResponseInfo(Constants.SUCCESS_CODE, Constants.SUCCESS_DESC);
		}
		else
		{
			info = new ResponseInfo(Constants.SUCCESS_CODE, Constants.NO_DATA_FOUND);
		}
		employeeResponseVo.setResponseInfo(info);
		return employeeResponseVo;
	}

	public void saveAllEmployees(List<Employee> employeeList) {
		logger.info("EmployeeService.saveAllEmployees() method execution started"); 
		employeeRepository.saveAll(employeeList);
	}

	public EmployeeSortResponseVo sortEmployeesBasedParam(EmployeeSortRequestVo employeeSort) {
		logger.info("EmployeeService.sortEmployeesBasedParam() method execution started"); 
		ResponseInfo info;
		EmployeeSortResponseVo employeeSortResponseVo = new EmployeeSortResponseVo();
		if(employeeSort==null || employeeSort.getEmployeeList()==null || employeeSort.getSortParam() == null)
		{
			info = new ResponseInfo(Constants.FAILURE_CODE, Constants.INVALID_REQUEST);
			employeeSortResponseVo.setResponseInfo(info);
			logger.info("EmployeeService.sortEmployeesBasedParam() Invalid Request Received"); 
			return employeeSortResponseVo;
		}
		else
			info = new ResponseInfo(Constants.SUCCESS_CODE, Constants.SUCCESS_DESC);
		List<Employee> empList = employeeSort.getEmployeeList();
		String sortParam = employeeSort.getSortParam();
		if(!validateSortParam(sortParam))
		{
			info = new ResponseInfo(Constants.FAILURE_CODE, Constants.INVALID_REQUEST);
			employeeSortResponseVo.setResponseInfo(info);
			logger.info("EmployeeService.sortEmployeesBasedParam() Invalid Request Received"); 
			return employeeSortResponseVo;
		}
		if(SortTypeEnum.HIREDATE.toString().equalsIgnoreCase(sortParam))
		{
			Collections.sort(empList, new EmployeeComparatorHireDate());
		}
		else if(SortTypeEnum.NAME.toString().equalsIgnoreCase(sortParam))
		{
			Collections.sort(empList, new EmployeeComparatorName());
		}
		else if(SortTypeEnum.SALARY.toString().equalsIgnoreCase(sortParam))
		{
			Collections.sort(empList, new EmployeeComparatorSalary());
		}
		employeeSortResponseVo.setEmployeeList(empList);
		employeeSortResponseVo.setResponseInfo(info);
		employeeSortResponseVo.setSortParam(sortParam);
		logger.info("EmployeeService.sortEmployeesBasedParam() method execution finished"); 
		return employeeSortResponseVo;
	}
	
	public boolean validateSortParam(String sortParam)
	{
		if(sortParam !=null && (SortTypeEnum.HIREDATE.toString().equalsIgnoreCase(sortParam)
								|| SortTypeEnum.NAME.toString().equalsIgnoreCase(sortParam)
								|| SortTypeEnum.SALARY.toString().equalsIgnoreCase(sortParam)))
			{
				return true;
			}
			else return false;
			
	}
}
