package javafirst1;
import java.util.Scanner;

public class sum21 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	int a,b ,c;
	
	System.out.println("Enetr two number");
	a=sc.nextInt();
	b=sc.nextInt();
	test obj=new test();
	c=obj.call(a,b);
	if(c>30)
		System.out.println(c);
	else
	{
		runner ob=new runner();
		ob.main(args);
	}
	sc.close();
	
	}
}
