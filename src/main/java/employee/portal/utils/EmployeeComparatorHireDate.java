package employee.portal.utils;

import java.util.Comparator;

import employee.portal.model.Employee;

public class EmployeeComparatorHireDate implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getHireDate().compareTo(o2.getHireDate());
	}

}
