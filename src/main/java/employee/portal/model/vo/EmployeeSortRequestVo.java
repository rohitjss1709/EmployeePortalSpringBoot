package employee.portal.model.vo;

import java.util.List;

import employee.portal.model.Employee;

public class EmployeeSortRequestVo {
	
	private List<Employee> employeeList;
	private String sortParam;
	/**
	 * @return the employeeList
	 */
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	/**
	 * @param employeeList the employeeList to set
	 */
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	/**
	 * @return the sortParam
	 */
	public String getSortParam() {
		return sortParam;
	}
	/**
	 * @param sortParam the sortParam to set
	 */
	public void setSortParam(String sortParam) {
		this.sortParam = sortParam;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeSortResponseVo [employeeList=" + employeeList + ", sortParam=" + sortParam + "]";
	}
	
	
	
}
