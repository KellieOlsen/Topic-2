import java.util.Scanner;

public class Extwelve {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int num = input.nextInt();
		
		int first = num/100;
		int last = num%10;
		
		if (first == last){
			System.out.print(num + " is a palindrome.");
		}
			else {
			System.out.print(num + " is not a palindrome.");
			
		}
		
	}

}
