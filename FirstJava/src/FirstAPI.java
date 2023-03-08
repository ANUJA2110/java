import java.util.Scanner;
public class FirstAPI {
	void add()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers +");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("addition result "+c);
	}
	int sub(){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers -");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a-b;
		return c;
	}
	void mul(int a,int b){
		int c=a*b;
		System.out.println("multiplication result "+c);
	}

	int div(int num1,int num2){
		int c=num1/num2;
		return c;
	}
}


