import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EmployeeDbTest {

	@Test
	public void test1() {
		EmployeeDb employeeDb = new EmployeeDb();
		Employee employee = new Employee(0, "Saurav", 20000, "SDE", "CSE");
		employeeDb.addEmployee(employee);

		// Test for GetEmployeeById and getEmployees
		assertEquals(1, employeeDb.getEmployees().size());
		assertFalse(employeeDb.getEmployees().isEmpty());
		assertEquals(0, employeeDb.getEmployeeById(0).getId());
		assertEquals("Saurav", employeeDb.getEmployeeById(0).getName());
		assertEquals(20000, employeeDb.getEmployeeById(0).getSalary(), 0);
		assertEquals("SDE", employeeDb.getEmployeeById(0).getJobTitle());
		assertEquals("CSE", employeeDb.getEmployeeById(0).getDepartment());

		// Test for removeEmployee
		assertFalse(employeeDb.removeEmployee(1));
		assertTrue(employeeDb.removeEmployee(0));

	}

	@Test
	public void test2() {
		EmployeeDb employeeDb = new EmployeeDb();
		Employee employee = new Employee(2, "Lalit", 50000, "Designer", "Development");
		employeeDb.addEmployee(employee);
		assertEquals(1, employeeDb.getEmployees().size());
		assertFalse(employeeDb.getEmployees().isEmpty());
		assertEquals(2, employeeDb.getEmployeeById(2).getId());
		assertEquals("Lalit", employeeDb.getEmployeeById(2).getName());
		assertEquals(50000, employeeDb.getEmployeeById(2).getSalary(), 0);
		assertEquals("Designer", employeeDb.getEmployeeById(2).getJobTitle());
		assertEquals("Development", employeeDb.getEmployeeById(2).getDepartment());
		assertFalse(employeeDb.removeEmployee(3));
		assertTrue(employeeDb.removeEmployee(2));
	}

	@Test
	public void test3() {
		EmployeeDb employeeDb = new EmployeeDb();
		Employee employee = new Employee(3, "Paras", 20000, "Web Developer", "Development");
		employeeDb.addEmployee(employee);
		assertEquals(1, employeeDb.getEmployees().size());
		assertFalse(employeeDb.getEmployees().isEmpty());
		assertEquals(3, employeeDb.getEmployeeById(3).getId());
		assertEquals("Paras", employeeDb.getEmployeeById(3).getName());
		assertEquals(20000, employeeDb.getEmployeeById(3).getSalary(), 0);
		assertEquals("Web Developer", employeeDb.getEmployeeById(3).getJobTitle());
		assertEquals("Development", employeeDb.getEmployeeById(3).getDepartment());
		assertFalse(employeeDb.removeEmployee(4));
		assertTrue(employeeDb.removeEmployee(3));
	}

	@Test
	public void test4() {
		EmployeeDb employeeDb = new EmployeeDb();
		Employee employee = new Employee(4, "Pranav", 100000, "Backend Developer", "Development");
		employeeDb.addEmployee(employee);
		assertEquals(1, employeeDb.getEmployees().size());
		assertFalse(employeeDb.getEmployees().isEmpty());
		assertEquals(4, employeeDb.getEmployeeById(4).getId());
		assertEquals("Pranav", employeeDb.getEmployeeById(4).getName());
		assertEquals(100000, employeeDb.getEmployeeById(4).getSalary(), 0);
		assertEquals("Backend Developer", employeeDb.getEmployeeById(4).getJobTitle());
		assertEquals("Development", employeeDb.getEmployeeById(4).getDepartment());
		assertFalse(employeeDb.removeEmployee(5));
		assertTrue(employeeDb.removeEmployee(4));
	}

	@Test
	public void test5() {
		EmployeeDb employeeDb = new EmployeeDb();
		Employee employee = new Employee(5, "Rahul", 50000, "SDE", "CSE");
		employeeDb.addEmployee(employee);
		assertEquals(1, employeeDb.getEmployees().size());
		assertFalse(employeeDb.getEmployees().isEmpty());
		assertEquals(5, employeeDb.getEmployeeById(5).getId());
		assertEquals("Rahul", employeeDb.getEmployeeById(5).getName());
		assertEquals(50000, employeeDb.getEmployeeById(5).getSalary(), 0);
		assertEquals("SDE", employeeDb.getEmployeeById(5).getJobTitle());
		assertEquals("CSE", employeeDb.getEmployeeById(5).getDepartment());
		assertFalse(employeeDb.removeEmployee(6));
		assertTrue(employeeDb.removeEmployee(5));
	}

}