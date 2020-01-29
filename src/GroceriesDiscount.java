import java.util.Scanner;

public class GroceriesDiscount {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// here are the variables
		double total;
		double discount;
		boolean transaction;
		
		//this is the loop
		while (transaction = true) {
		
			System.out.println("Hello customer, how much have you spent?");
			total = in.nextDouble();
			System.out.println(total);
		
			//here is where the if statements start
			if (0 < total && total < 10) {	
			
			System.out.println("Thank you for your purchase.");
			System.out.println("");
			
			} else if (10.0 <= total && total <= 60.0) {
		
			discount = total * 0.08;
			System.out.println("Thank you for your purchase!");
			System.out.println("You get a discount of $" +String.format("%.2f", discount)+ " to your purchase! (8% discount");
			System.out.println("");
			
			} else if (60.0 < total && total <= 150.0) {
			
			discount = total * 0.1;
			System.out.println("Thank you for your purchase!");
			System.out.println("You get a discount of $" +String.format("%.2f", discount)+ " to your purchase! (10% discount");
			System.out.println("");
			
			} else if (150.0 < total && total <= 250.0) {
			
			discount = total * 0.12;
			System.out.println("Thank you for your purchase!");
			System.out.println("You get a discount of $" +String.format("%.2f", discount)+ " to your purchase! (12% discount");
			System.out.println("");
			
			} else if (210 < total) {
			
			discount = total * 0.14;
			System.out.println("Thank you for your purchase!");
			System.out.println("You get a discount of $" +String.format("%.2f", discount)+ " to your purchase! (14% discount");
			System.out.println("");
			
			//this is what breaks you out of the loop
			} else if (total == 0) {
				
			System.out.println("Thank you for shopping with us!");
			transaction = false;
			break;
			
			} else {
			
			System.out.println("Sorry, I didn't quite get that.");
				
			}
			
		}

	}

}
