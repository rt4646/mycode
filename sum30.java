package javafirst1;

import java.util.Scanner;

public class sum30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b ,c;
		while(true){
		System.out.println("Enetr rwo number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		if(c>=30) {
		System.out.println("Sum= "+c);
	
			
		sc.close();
		System.exit(0);
		}

}
}
}