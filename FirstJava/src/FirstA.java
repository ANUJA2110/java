import java.util.*;
class FirstA{
	public static void main(String[] args) {
		FirstAPI api=new FirstAPI();
		//addition
		api.add();
		//substraction
		int res1=api.sub();
		System.out.println("substraction result is "+res1);
		//multiplication
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		api.mul(a, b);
		//division
		System.out.println("enter two numbers");
		 a=scan.nextInt();
		 b=scan.nextInt();
		int c=api.div(a, b);
		System.out.println("division result " +c);
	}
}