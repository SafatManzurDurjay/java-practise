package javacoding;

import java.util.Scanner;

public class Logical_operator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char ch;
		
		System.out.println("Enter any letter : ");
		
		ch = input.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			
			System.out.println("Small Letter");
		}
		
		else if(ch>='A' && ch<='X') {
			
			System.out.println("Capital Letter");
		}
		
		else {
			
			System.out.println("Not a letter");
		}
			

	}

}
