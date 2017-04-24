import java.util.Scanner;

public class Three_Thirtythree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		double total1 = (price1 / weight1);
		
		System.out.print("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		double total2 = (price2 / weight2);
		
		if (total1 > total2)
			System.out.print("Package 2 has a better price.");
		if (total2 > total1)
			System.out.print("Package 1 has a better price.");		
		

	}

}
