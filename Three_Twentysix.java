import java.util.Scanner;

public class Three_Twentysix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		if (number % 5 == 0 && number % 3 == 0)
			System.out.print(number + " is divisible by 5 and 6.");
		System.out.println();
		if (number % 5 == 0 || number % 6 == 0)
			System.out.print(number + " is divisible by 5 or 6.");
		System.out.println();
		if (number % 5 == 0 ^ number % 6 == 0)
			System.out.print(number + " is divisible by 5 or 6, but not both.");

	}

}
