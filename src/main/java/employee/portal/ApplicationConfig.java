package employee.portal;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import employee.portal.model.Employee;
import employee.portal.service.EmployeeService;

/**
 * @author RohitSaini
 *
 * Application Configuration Class for Employee Portal
 */

@SpringBootApplication
public class ApplicationConfig {
	
	private static final Logger logger = LogManager.getLogger(ApplicationConfig.class);

	@Autowired
	EmployeeService employeeService;
	
	public static void main(String[] args) {

		logger.info("Main application starting execution");
		SpringApplication.run(ApplicationConfig.class, args);
		logger.info("Main application started execution");
	}

	
	@PostConstruct
	public void init() {
		logger.info("Employee Data Loading started");
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Rohit", getDate(-10), 20000));
		employeeList.add(new Employee("Manish", getDate(-5), 25000));
		employeeList.add(new Employee("Abhi", getDate(-8), 15000));
		employeeList.add(new Employee("Prem", getDate(-1), 18000));
		employeeList.add(new Employee("Amar", getDate(-2), 10000));
		employeeService.saveAllEmployees(employeeList);
		logger.info("Employee Data Loading finished");
	}
	
	public Date getDate(int years)
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, years); 
		return cal.getTime();
	}
	
}
