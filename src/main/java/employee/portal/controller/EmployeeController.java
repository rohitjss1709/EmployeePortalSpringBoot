package employee.portal.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employee.portal.model.Employee;
import employee.portal.model.vo.EmployeeResponseVo;
import employee.portal.model.vo.EmployeeSortRequestVo;
import employee.portal.model.vo.EmployeeSortResponseVo;
import employee.portal.service.EmployeeService;

/**
 * @author RohitSaini
 *
 * Controller Class for Employee Portal
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger logger = LogManager.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/getAll")
	public EmployeeResponseVo getAllEmployees() {
		logger.info("EmployeeController.getAllEmployees() method started execution");
		EmployeeResponseVo employeeResponseVo;
		employeeResponseVo = employeeService.getAllEmployees();
		return employeeResponseVo;
	}
	
	@PostMapping("/sort")
	public EmployeeSortResponseVo sortEmployees(@RequestBody EmployeeSortRequestVo employeeSort)  {
		logger.info("EmployeeController.sortEmployees() method started execution with request : "+employeeSort.toString());
		EmployeeSortResponseVo employeeSortResponseVo;
		
		employeeSortResponseVo = employeeService.sortEmployeesBasedParam(employeeSort);
		
		return employeeSortResponseVo;
	}
}
