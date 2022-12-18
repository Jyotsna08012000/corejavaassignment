package Assignment;

public class assign22 {
	void Area(double side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
   
    void Area(float side)
    {
        System.out.println("Area of the Square: "+ side * side);
    }
   
        void Area(double l, double b)
        {
            System.out.println("Area of the rectangle: " + l * b);
        }
        
        void Area(int l, int b)
        {
            System.out.println("Area of the rectangle: " + l * b);
        }
    

	public static void main(String[] args) {
		assign22 obj = new assign22();
        obj.Area(20);
        obj.Area(5.2);
        obj.Area(250, 260);
        obj.Area(5, 9);
       
        
        
       
	}


}
