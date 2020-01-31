import java.util.Scanner;

public class GroceriesDiscount {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		// here are the variables:
		double total;
		double discount;
		boolean transaction;
		
		//this is the loop/
		while (transaction = true) {
			
			//this is where we type in a price value
			System.out.println("Type in '0' to end the transaction!");
			System.out.println("Hello customer, how much have you spent?");
			
			while (!in.hasNextDouble()) {	
				
				System.out.println("Sorry, that's not a number, try again!");
				in.next();
				continue;
			}
			
				total = in.nextDouble();
		
				//here is where the if statements start
				if (0 < total && total < 10) {	
			
				System.out.println("Thank you for your purchase.");
				System.out.println("Unfortunately, you are ineligible for a coupon at this time.");
				System.out.println("");
			
				} else if (10.0 <= total && total <= 60.0) {
		
				discount = total * 0.08;
				System.out.println("Thank you for your purchase!");
				System.out.println("You get a discount coupon of $" +String.format("%.2f", discount)+ " to your purchase! (8% discount");
				System.out.println("");
			
				} else if (60.0 < total && total <= 150.0) {
			
				discount = total * 0.1;
				System.out.println("Thank you for your purchase!");
				System.out.println("You get a discount coupon of $" +String.format("%.2f", discount)+ " to your purchase! (10% discount");
				System.out.println("");
			
				} else if (150.0 < total && total <= 250.0) {
			
				discount = total * 0.12;
				System.out.println("Thank you for your purchase!");
				System.out.println("You get a discount coupon of $" +String.format("%.2f", discount)+ " to your purchase! (12% discount");
				System.out.println("");
			
				} else if (210 < total && total <= 1000) {
			
				discount = total * 0.14;
				System.out.println("Thank you for your purchase!");
				System.out.println("You get a discount coupon of $" +String.format("%.2f", discount)+ " to your purchase! (14% discount");
				System.out.println("");
			
				} else if (total > 1000) {
			
				System.out.println("Sorry, that number is not possible.");
				System.out.println("");
				
				//this is what breaks you out of the loop (test4)
				} else if (total == 0) {
				
				System.out.println("Thank you for shopping with us!");
				transaction = false;
				break;
				
				}
			  
		  
		}

	}

}
