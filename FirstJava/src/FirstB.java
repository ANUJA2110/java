import java.util.Scanner;
public class FirstB {

	public static void main(String[] args) {
		FirstAPIB apib=new FirstAPIB();
		//addition
		System.out.println("enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=apib.add(a, b);
		System.out.println("addition result " +c);
		//substraction
		System.out.println("enter two numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		c=apib.sub(a, b);
		System.out.println("substraction result " +c);
		//multiplication
		System.out.println("enter two numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		int c=apib.mul(a, b);
		System.out.println("multiplication result " +c);
		//division
		System.out.println("enter two numbers");
		a=scan.nextInt();
		b=scan.nextInt();
		int c=apib.div(a, b);
		System.out.println("division result " +c);
	}
}
}
