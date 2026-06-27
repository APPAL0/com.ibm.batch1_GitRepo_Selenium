package luhnCheck;

import java.util.Scanner;



public class luhnCheckTest {
	
	 static boolean isValid(String number) {
	        int sum = 0;
	        boolean doubleDigit = false;

	        for (int i = number.length() - 1; i >= 0; i--) {
	            int digit = number.charAt(i) - '0';

	            if (doubleDigit) {
	                digit = digit * 2;
	                if (digit > 9) {
	                    digit -= 9;
	                }
	            }

	            sum += digit;
	            doubleDigit = !doubleDigit;
	        }

	        return sum % 10 == 0;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Debit Card Number: ");
	        String cardNumber = sc.nextLine();

	        if (cardNumber.matches("\\d+") && isValid(cardNumber)) {
	            System.out.println("✅ Valid card number");
	        } else {
	            System.out.println("❌ Invalid card number");
	        }

	        sc.close();


	}

}
