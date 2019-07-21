package employee.portal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author RohitSaini
 *
 * Employee Modal Class for Employee Portal
 */

@Entity
public class Employee {

	@Id @GeneratedValue
	@Column(name="SERIAL_NO")
	private int serialNo;
	
	@Column(name="EMP_NAME")
	private String name;
	
	@Column(name="EMP_HIRE_DATE")
	private Date hireDate;
	
	@Column(name="EMP_SALARY")
	private int salary;
	
	
	public Employee() {
		super();
	}
	public Employee(String name, Date hireDate, int salary) {
		super();
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
	}
	/**
	 * @return the serialNo
	 */
	public int getSerialNo() {
		return serialNo;
	}
	/**
	 * @param serialNo the serialNo to set
	 */
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the hireDate
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [serialNo=" + serialNo + ", name=" + name + ", hireDate=" + hireDate + ", salary=" + salary
				+ "]";
	}
	
	
	
}
