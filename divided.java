package javafirst1;

import java.util.Scanner;

public class divided {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enetr a no");
		int a=scanner.nextInt();
		
		if(a%3==0)
		{
			System.out.println("number is divided by 3");
		}
		else if(a%4==0)
		{
			System.out.println("number is divided by 4");
			
			
			
		}
		else
		{
			System.out.println("no is not divided by both");
			
		}
	}

}
