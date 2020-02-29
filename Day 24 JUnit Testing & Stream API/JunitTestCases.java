package com.cts.training.junit.day24;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cts.training.calculator.day24.Calculator;

public class JunitTestCases {

	private static Calculator calculator;

	@BeforeClass
	public static void init() {
		calculator = new Calculator();
		System.out.println("Object Created");
	}

	@AfterClass
	public static void destroy() {
		calculator = null;
		System.out.println("Object Destroyed");
	}

	@Test
	public void test_add_success() {
		assertEquals(5, calculator.add(3, 2));
		System.out.println("Add Test Case Pass");
	}

	@Test
	public void test_subtract_success() {
		assertEquals(1, calculator.subtract(3, 2));
		System.out.println("Subtract Test Case Pass");
	}

	@Test
	public void test_multiply_success() {
		assertEquals(6, calculator.multiply(3, 2));
		System.out.println("Multiply Test Case Pass");
	}

	@Test
	public void test_divide_success() {
		assertEquals(3, calculator.divide(6, 2));
		System.out.println("Divide Test Case Pass");
	}

	@Test
	public void test_to_check_prime_number_success() {
		assertEquals(true, calculator.isPrime(5));
		System.out.println("PrimeNumber Test Case Pass");

	}

	@Test
	public void test_to_check_prime_number_failure() {
		assertEquals(false, calculator.isPrime(4));
		System.out.println("PrimeNumber Test Case Pass");

	}
}
