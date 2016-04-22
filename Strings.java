package com.joyce.august.sourceit.dz4;

import java.util.Scanner;

public class Strings {

	private static Scanner scStrings;

	public static void combineStrings() {
		scStrings = new Scanner(System.in);
		System.out.println("Введите три строки, которые хотите объединить");
		String str1 = scStrings.nextLine();
		String str2 = scStrings.nextLine();
		String str3 = scStrings.nextLine();

		String combinedStrings = str1.concat(" " + str2 + " " + str3);
		System.out.println(combinedStrings);
	}

}
