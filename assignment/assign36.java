package Assignment;

import java.util.Scanner;

public class assign36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			int a,b,c;
			Scanner sc=new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			a=sc.nextInt();
       
			System.out.print("Enter second number : ");
			b=sc.nextInt();
       
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}

		System.out.println("End of Program...");

	}

}
