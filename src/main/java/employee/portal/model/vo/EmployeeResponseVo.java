package employee.portal.model.vo;

import java.util.List;

import employee.portal.model.Employee;

public class EmployeeResponseVo {
	
	private List<Employee> employeeList;
	private ResponseInfo responseInfo;
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
	 * @return the responseInfo
	 */
	public ResponseInfo getResponseInfo() {
		return responseInfo;
	}
	/**
	 * @param responseInfo the responseInfo to set
	 */
	public void setResponseInfo(ResponseInfo responseInfo) {
		this.responseInfo = responseInfo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeResponseVo [employeeList=" + employeeList + ", responseInfo=" + responseInfo + "]";
	}
	
	
}
