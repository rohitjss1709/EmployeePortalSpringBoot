package employee.portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.portal.model.Employee;

/**
 * @author RohitSaini
 *
 * JPA Repository Interface for Employee Portal
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	/*public List<Employee> findAllOrderByNameDesc();
	public List<Employee> findAllOrderByNameAsc();
	
	public List<Employee> findAllOrderByHireDateDesc();
	public List<Employee> findAllOrderByHireDateAsc();
	
	public List<Employee> findAllOrderBySalaryDesc();
	public List<Employee> findAllOrderBySalaryAsc();*/
}
