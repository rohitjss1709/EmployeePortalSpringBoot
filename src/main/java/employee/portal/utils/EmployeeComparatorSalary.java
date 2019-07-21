package employee.portal.utils;

import java.util.Comparator;

import employee.portal.model.Employee;

public class EmployeeComparatorSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		Integer i1 = o1.getSalary();
		Integer i2 = o2.getSalary();
		return i1.compareTo(i2);
	}

}
