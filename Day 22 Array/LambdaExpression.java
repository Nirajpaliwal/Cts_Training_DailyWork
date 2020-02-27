package com.cts.training.day22;

public class LambdaExpression {

	public static void main(String[] args) {

		Calculator sum_operation = (p, q) -> p + q;
		System.out.println("Addition : " + sum_operation.display_result(10, 20));

		Calculator subtraction_operation = (p, q) -> p - q;
		System.out.println("Subtraction  : S" + subtraction_operation.display_result(100, 20));

		Calculator multiplication_operation = (p, q) -> p * q;
		System.out.println("Multiplication  : " + multiplication_operation.display_result(10, 20));

		Calculator division_operation = (p, q) -> p / q;
		System.out.println("Division  : " + division_operation.display_result(200, 20));

	}

}

@FunctionalInterface
interface Calculator {
	double display_result(int x, int y);
}
