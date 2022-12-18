package Assignment;

import java.util.Scanner;

abstract class Student{
	   public abstract void marks();
	   
	 }
	class marksDetails extends Student{
		@Override
		public void marks() {
		
			 
			 int marks[] = new int[6];
		        int i;
		        float total=0, avg;
		        Scanner scanner = new Scanner(System.in);
		        for(i=0; i<6; i++) { 
		           System.out.print("Enter Marks of Subject"+(i+1)+":");
		           marks[i] = scanner.nextInt();
		           total = total + marks[i];
		        }
		        scanner.close();
		  
		        avg = total/6;
			 
		 
				System.out.print("The student Grade is: ");
		        if(avg>=90)
		        {
		            System.out.print("A");
		        }
		        else if(avg>=80 && avg<90)
		        {
		           System.out.print("B");
		        } 
		        else if(avg>=70 && avg<80)
		        {
		            System.out.print("C");
		        }
		        else if(avg>=60 && avg<70)
		        {
		            System.out.print("D");
		        }
		        else if(avg>=40 && avg<60)
		        {
		            System.out.print("DD");
		        }
		        else
		        {
		            System.out.print("FAIL");
		        }
		    }
				
			}


public class assign33 {
	public static void main(String[] args) {
		marksDetails MD= new marksDetails();
		MD.marks();
	}
	
	

}
