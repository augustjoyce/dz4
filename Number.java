package com.joyce.august.sourceit.dz4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	private static Scanner scNumber;
	private static double number;

	public static void numFormule() {
		scNumber = new Scanner(System.in);
		System.out.println("Пожалуйста, введите трехзначное число " + "с пятью знаками после запятой");

		try {
			number = scNumber.nextDouble();
			String num = Double.toString(number);
			if (num.length() != 9) {
				numFormule();
			} else if (num.charAt(3) != '.') {
				numFormule();
			} else {
				int number2 = (int) (number * 100000);
				int formule = (number2 % 100000000 / 10000000 + number2 % 10000000 / 1000000
						- number2 % 1000000 / 100000 + number2 % 100000 / 10000 - number2 % 10000 / 1000
						+ number2 % 1000 / 100 - number2 % 100 / 10 + number2 % 10);
				System.out.println(number2 % 100000000 / 10000000 + "+" + number2 % 10000000 / 1000000 + "-"
						+ number2 % 1000000 / 100000 + "+" + number2 % 100000 / 10000 + "-" + number2 % 10000 / 1000
						+ "+" + number2 % 1000 / 100 + "-" + number2 % 100 / 10 + "+" + number2 % 10 + "=" + formule);
			}
		} catch (InputMismatchException e) {
			numFormule();
		}

	}

}
