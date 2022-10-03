package javacoding;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		
		
	Scanner scanner = new Scanner(System.in);	
		
		String state = "Y";
		
		while (state.toLowerCase().equals("y")) {
						
			System.out.println("Enter First Number : ");	
			
			int num1 = scanner.nextInt();
			
			System.out.println("Enter Second Number : ");
			
			int num2 = scanner.nextInt();
			
			int sum = num1 + num2;
			
			System.out.println("Sum : " + sum);
			
			System.out.println("Do you want to run again? type y ");
			state = scanner.next();
		}
		
	
		
		System.out.println("End");
		scanner.close();
		
	}

}
