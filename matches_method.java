package uki2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 2. 3. 4.");
		int a = scan.nextInt();
		if (a == 1) {
			List<String> strList = Arrays.asList("Chicago", "London", "Lisbon", "Mumbai");
			for (String str : strList) {
				if (str.matches("L.*"))
					System.out.println(str);
			}
		}
		if (a == 2) {
			String[] words = { "a123", "*67t", "test", "54&ty" };
			for (String str : words) {
				if (str.matches("[a-z]+")) {
					System.out.println("matched string - " + str);
				}
			}
		}
		if (a == 3) {
			String[] w = { "a123", "*67t", "test", "54&ty" };
			for (String str : w) {
				if (str.matches("[a-z]+")) {
					System.out.println("matched string - " + str);
				}
			}
		}
		if (a == 4) {
			String[] s = { "a123", "*67t", "test", "54&ty" };
			for (String str : s) {
				if (str.matches("\\w+")) {
					System.out.println("matched string - " + str);
				}
			}
		}
	}
}
