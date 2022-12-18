package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



	class studentSSSS
	{
	 
	 int age;
	 int rollno;
	 String course;
	 String name;

	 studentSSSS()
	 {
	 
	  System.out.println("enter details:");
	  rollno=0;
	  age=0;
	  name="No Name Assigned";
	 
	 }

	 studentSSSS(int a,int b,String c,String d)
	 { 
	 
	  System.out.println("enter detais");
	  rollno=a;
	  age=b;
	  name=c;
	  course=d;
	 
	 }

	 void display()
	 {

	  System.out.println("Roll no : "+rollno+"\nName : "+name+"\nAge : "+age+"\nCourse : "+course);
	 
	 }

	}

	class AgeNotWithinRangeException extends Exception
	{
	 
	 public AgeNotWithinRangeException(String s)
	 {
	  
	   super(s);
	 
	 }

	}

	class NameNotValidException extends Exception
	{
	 
	 public NameNotValidException(String s)
	 {
	  
	   super(s);
	 
	 }

	}


	public class assign42 {

		public static void main(String[] args) {
			try
	        {
	     
	         int n1,a1,b1;
	         char []c;
	    String c1,d1;
	  
	   System.out.println("Enter no of students : ");
	  
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   n1=Integer.parseInt(br.readLine());
	  
	   studentSSSS o[]=new studentSSSS[n1];
	  
	   System.out.println("Enter data");
	  
	   for(int i=0;i<n1;i++)
	   { 
	   
	    System.out.println("Roll No : ");
	     a1=Integer.parseInt(br.readLine());
	    
	    System.out.println("Age : ");
	    b1=Integer.parseInt(br.readLine());  
	   
	    if(b1>21 || b1<15)
	     throw new AgeNotWithinRangeException("Age Not Valid");

	    System.out.println("Name : ");
	    c1=br.readLine();
	    c=c1.toCharArray();
	   
	    for(int j=0;j<c1.length();j++)
	    {
	             
	                 if (! Character.isLetter(c[j]))
	                     throw new NameNotValidException("Name contains digits or special characters");
	               
	                }
	  
	    System.out.println("Course : ");
	                d1=br.readLine();
	 
	    o[i]=new studentSSSS(a1,b1,c1,d1);
	     
	         }

	      System.out.println("Data : ");
	  
	   for(int i=0;i<n1;i++)
	    o[i].display();
	 
	  }

	  catch(IOException e)
	  {
	   
	   System.out.println(e);
	   
	  }

	     catch(AgeNotWithinRangeException e)
	     {
	     
	      System.out.println(e);
	      
	     }

	   catch(NameNotValidException e)
	   {
	    
	    System.out.println(e);
	    
	   }

	 }



		}


