package javafirst1;
import java.util.Scanner;

class ne{
	public void add(int a,int b) {
		int c;
		c=a+b;
		System.out.println("addition is"+c);
		
	}
}
class child extends ne{
	public void add(int d,int r) {
		int k;
		k=d*r;
		System.out.println("multiplication is"+k);
	}
}
public class Extendclass {
	public static void main(String[] args) {
		ne n=new child();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter");
		n.add(scanner.nextInt(),scanner.nextInt());
		scanner.close();
	}

}

