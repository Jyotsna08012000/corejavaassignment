package Assignment;

import java.util.Scanner;

abstract class number1{
	public abstract void factorials();
}
	   
class number2 extends number1{
	   
	@Override
	public void factorials() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
		 int num=sc.nextInt();
		 int i=1,fact=1;
		   while(i<=num)
		    {
		      fact=fact*i;
		       i++;
		     }
		      System.out.println("Factorial of the number: "+fact);  
		     }   
		   }
		   
	   

	
		

public class assign31 {
	public static void main(String[] args) {
		number2 n2 = new number2();
		n2.factorials();
	}

}
