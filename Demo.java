package com.joyce.august.sourceit.dz4;

import java.util.Scanner;

public class Demo {

	private static Scanner input;

	public static void main(String[] args) {
		
		menu();
		

	}

	public static void menu() {
		System.out.println("Выберите, что нужно сделать:\n1:Соединить строку"
				+ "\n2:Расчитать значение формулы\n3:Определить ваш уровень доходов");
		
		input = new Scanner(System.in);
		int in = input.nextInt();
		
		switch (in) {
		case 1:
			Strings.combineStrings();
			break;
		case 2:
			Number.numFormule();
			break;
		case 3:
			Salary.salary();
			break;
	
		default:
			System.out.println("Нужно ввести номер задания");
			menu();
			break;
		}
	}

}
