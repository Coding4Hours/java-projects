import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class AgeCalc {

	public static void main(String[] args) {

		System.out.println("Enter the year you were born");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println("Enter the month you were born");
		int input1 = scanner.nextInt();
		System.out.println("Enter the day you were born");
		int input2 = scanner.nextInt();
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(input, input1, input2);
		int years = Period.between(birthDate, today).getYears();
		System.out.println("You are " + years + " years old.");
	}

}
