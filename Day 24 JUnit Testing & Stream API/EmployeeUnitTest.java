package com.cts.training.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;

import com.cts.training.dao.impl.EmployeeDAOImpl;
import com.cts.training.bean.Employee;
import com.cts.training.employee.dao.EmployeeDAO;

import org.junit.Test;

public class EmployeeUnitTest {
	private static EmployeeDAO employeeDAO;
	private static Employee employee;

	@BeforeClass
	public static void init() {
		employee = new Employee();
		employeeDAO = new EmployeeDAOImpl();
	}

	@AfterClass
	public static void destro() {
		employee = null;
		employeeDAO = null;
	}
	
//	@Ignore
//	@Test
//	public void test_add_employee_success() {
//		Employee emp = new Employee(134, "Vikas", "Kolkata", "Tester", 25, 24415, 85698);
//		assertEquals(true, employeeDAO.saveEmployee(emp));
//		System.out.println("Employee details added succesfully");
//	}
//
//	@Test
//	public void test_add_employee_failure() {
//		Employee emp = new Employee(134, "Vikas", "Kolkata", "Tester", 25, 24415, 85698);
//		assertEquals(false, employeeDAO.saveEmployee(emp));
//		System.out.println("Failed to add emloyee details");
//	}

//	@Test
//	public void test_delete_employee_success() {
//		Employee emp1 = employeeDAO.getEmployeeById(134);
//		assertEquals(true, employeeDAO.deleteEmployee(emp1));
//		System.out.println("Employee details deleted succesfully");
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void test_delete_employee_failure() {
//		Employee emp1 = employeeDAO.getEmployeeById(134);
//		assertEquals(false, employeeDAO.deleteEmployee(emp1));
//		System.out.println("Error while deleting employee details");
//	}

//	@Test
//	public void test_update_employee_success() {
//		// Employee emp1 = employeeDAO.getEmployeeById(134);
//		assertEquals(true, employeeDAO.updateEmployee(134));
//		System.out.println("Updation test case pass");
//	}
//
//	@Test
//	public void test_update_employee_failure() {
//		// Employee emp1 = employeeDAO.getEmployeeById(134);
//		assertEquals(false, employeeDAO.updateEmployee(134));
//		System.out.println("Updation test case fail");
//	}

//	@Test
//	public void test_get_employee_by_id_success() {
//		Employee emp1 = employeeDAO.getEmployeeById(134);
//		assertEquals("kamal", emp1.getName());
//		System.out.println("getEmployeeById test case pass");
//	}

//	@Test
//	public void test_get_employee_by_id_failure() {
//		Employee emp1 = employeeDAO.getEmployeeById(134);
//		assertEquals("rajat", emp1.getName());
//		System.out.println("getEmployeeById test case pass fail");
//	}

//	@Test
//	public void test_get_all_employee_success() {
//		List<Employee> list = employeeDAO.getAllEmployees();
//		// assertEquals(2, list.size());
//		assertEquals("naveen", list.get(0).getName());
//
//		System.out.println("getAllEmployee test case pass pass");
//	}

//	@Test
//	public void test_get_all_employee_failure() {
//		List<Employee> list = employeeDAO.getAllEmployees();
//		// assertEquals(2, list.size());
//		assertEquals("pulkit", list.get(0).getName());
//		System.out.println("getAllEmployee test case pass fail");
//	}

}
