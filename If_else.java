package javacoding;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Enter integer number : ");
		
		num = input.nextInt();
		
		if(num>0){
			
			System.out.println("Positive");
		}
		
		else if(num<0) {
			
			System.out.println("Negative");
		}
		
		else {
			System.out.println("Equal to zero");
		}

	}

}
