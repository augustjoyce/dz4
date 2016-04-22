package com.joyce.august.sourceit.dz4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Salary {

	private static Scanner scSalary;

	public static void salary() {

		scSalary = new Scanner(System.in);
		System.out.println("Пожалуйста, введите вашу месячную зарплату");

		int sal = -1;
		try {
			sal = scSalary.nextInt();
			if (sal < 0)
				System.out.println("Вы в долгах");
		} catch (InputMismatchException e) {
			System.out.println("Вы что-то перепутали");
			salary();
		}

		if (sal >= 0 && sal < 1000)
			System.out.println("Критически малый доход");
		else if (sal > 0 && sal < 5000)
			System.out.println("Средний доход");
		else if (sal > 0 && sal < 100000)
			System.out.println("Высокий доход");
		else if (sal > 100000)
			System.out.println("Миллионер");
	}

}
