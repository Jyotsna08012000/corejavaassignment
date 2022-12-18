package Assignment;
class Rectangle0{    
	int length,breadth;  
	public Rectangle0(int l, int b)  
	{       
		length = l;       
		breadth = b;    
		}   
	void print_area()    
	{       
		System.out.println(length*breadth);   
		}   
	void print_perimeter()   
	{       
		System.out.println(2*(length+breadth));  
		}
	}
class Square extends Rectangle0       
{    
	public Square(int s)     
	{
		super(s, s);
		}     
	}

		

	

public class assign25 {
	public static void main(String[] args) {
		Rectangle0 r = new Rectangle0 (4,5);      
		Square s = new Square (4);     
		r.print_area();     
		r.print_perimeter();    
		s.print_area();      
		s.print_perimeter();    
	}
	
}
