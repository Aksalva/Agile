import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeTest employeeTest = new EmployeeTest();
		employeeTest.test1();
	}

	@Test
	public void test1() {
		Employee employee = new Employee(0, "Saurav", 20000, "SDE", "CSE");
		assertEquals(0, employee.getId());
		assertEquals("Saurav", employee.getName());
		assertEquals(20000, employee.getSalary(), 0);
		assertEquals("SDE", employee.getJobTitle());
		assertEquals("CSE", employee.getDepartment());
	}

	@Test
	public void test2() {
		Employee employee = new Employee(1, "Gorakh", 10000, "SDE", "CSE");
		assertEquals(1, employee.getId());
		assertEquals("Gorakh", employee.getName());
		assertEquals(10000, employee.getSalary(), 0);
		assertEquals("SDE", employee.getJobTitle());
		assertEquals("CSE", employee.getDepartment());
	}

	@Test
	public void test3() {
		Employee employee = new Employee(2, "Tannu", 50000, "Designer", "Development");
		assertEquals(2, employee.getId());
		assertEquals("Tannu", employee.getName());
		assertEquals(50000, employee.getSalary(), 0);
		assertEquals("Designer", employee.getJobTitle());
		assertEquals("Development", employee.getDepartment());
	}

	@Test
	public void test4() {
		Employee employee = new Employee(3, "Dheeraj", 20000, "Web Developer", "Development");
		assertEquals(3, employee.getId());
		assertEquals("Chhaya", employee.getName());
		assertEquals(20000, employee.getSalary(), 0);
		assertEquals("Web Developer", employee.getJobTitle());
		assertEquals("Development", employee.getDepartment());
	}

	@Test
	public void test5() {
		Employee employee = new Employee(4, "Saurav", 100000, "Backend Developer", "Development");
		assertEquals(4, employee.getId());
		assertEquals("Gorakh", employee.getName());
		assertEquals(100000, employee.getSalary(), 0);
		assertEquals("Backend Developer", employee.getJobTitle());
		assertEquals("Development", employee.getDepartment());

	}
}