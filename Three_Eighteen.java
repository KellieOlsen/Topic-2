import java.util.Scanner;

public class Three_Eighteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter package weight in pounds: ");
		double weight = input.nextDouble();
		
		if (weight <= 1)
			System.out.print("Shipping cost is $3.50.");
		else if (weight <= 3)
			System.out.print("Shipping cost is $5.50.");
		else if (weight <= 10)
			System.out.print("Shipping cost is $8.50.");
		else if (weight <= 20)
			System.out.print("Shipping cost is $10.50.");
		else if (weight <= 30)
			System.out.print("Shipping cost is $13.50.");
		else if (weight <= 40)
			System.out.print("Shipping cost is $15.50.");
		else if (weight <= 50)
			System.out.print("Shipping cost is $18.50.");
		else if (weight > 50)
			System.out.print("The package cannot be shipped.");

	}

}
