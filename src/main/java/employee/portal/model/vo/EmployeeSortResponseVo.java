package employee.portal.model.vo;

import java.util.List;

import employee.portal.model.Employee;

public class EmployeeSortResponseVo {
	
	private List<Employee> employeeList;
	private String sortParam;
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
		return "EmployeeSortResponseVo [employeeList=" + employeeList + ", sortParam=" + sortParam + ", responseInfo="
				+ responseInfo + "]";
	}
	
	
	
}
