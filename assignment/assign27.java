package Assignment;

import java.util.Scanner;

class ComplexNumber { 
	private final double real;
	private final double imaginary; 
	public ComplexNumber(double real, double imaginary) { 
		this.real = real; this.imaginary = imaginary;
		}
	public ComplexNumber sum(ComplexNumber other) { 
		double r = this.real + other.real; 
		double i = this.imaginary + other.imaginary; 
		return new ComplexNumber(r, i);
		}
	public ComplexNumber difference(ComplexNumber other) { 
		double r = this.real - other.real; 
		double i = this.imaginary - other.imaginary; 
		return new ComplexNumber(r, i);
		}
	public ComplexNumber product(ComplexNumber other) { 
		double r = this.real * other.real; 
		double i = this.imaginary * other.imaginary; 
		return new ComplexNumber(r, i);
	}
	public double getReal() {
		return real;
		}
	public double getImaginary() {
		return imaginary;
		} 
	@Override 
	public String toString() {
		return real + " + " + imaginary + "i";
		}
	}


public class assign27 {

		int n1, n2;
		public static void main(String[] args) {
		 ComplexNumber c1 = new ComplexNumber(2, 4);
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the 1st number: ");
		  int n1 = sc.nextInt();
		   
		  System.out.print("Enter the 2nd number: ");
		  int n2 = sc.nextInt();
		   
		 
		 ComplexNumber c2 = new ComplexNumber(n1, n2);
		 ComplexNumber sum = c1.sum(c2);
		 ComplexNumber difference = c1.difference(c2);
		 ComplexNumber product = c1.product(c2);
		 
		 System.out.println("first complex number: " + c1);
		 System.out.println("second complex number: " + c2); 
		 System.out.println("sum of two complex numbers: " + sum);
		 System.out.println("difference of two complex numbers: " + difference);
		 System.out.println("difference of two complex numbers: " + product);
		 } 
	} 


	


