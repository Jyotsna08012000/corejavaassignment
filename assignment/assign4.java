package Assignment;

import java.util.Scanner;

public class assign4 {

	public static void main(String[] args) {
		
			int i,n=0,s=0;
			double avg;
			Scanner sc = new Scanner(System.in);
			 
				for (i=0;i<5;i++)
				{
					System.out.println("Enter the 5 numbers : ");  
					 n = sc.nextInt();
					 s +=n;
				}
				{
					avg=s/5;
					System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg);  
				   
				    
			}
			

		}

	}

	


