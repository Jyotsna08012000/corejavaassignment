package Assignment;
abstract class Shape0{

	abstract void RectangleArea(float length , float breadth);
    abstract void SquareArea(float radius);
    abstract void CircleArea(float side);

}

class Area extends Shape0{

	double Area=0;

	@Override
    void RectangleArea(float length , float breadth){
    Area = length * breadth;
        System.out.println("Area of rectangle is: "+Area);
    }

	@Override
    void SquareArea(float Side){
    Area = Side * Side;
        System.out.println("Area of Square is: "+Area);

    }

    @Override
    void CircleArea(float radius){
    Area = (radius * radius)*3.14;

        System.out.println("Area of Circle is: "+Area);

    }

}

public class assign32 {
	public static void main(String[] args) {
		  Area a = new Area();

	        a.RectangleArea(25.2f, 7.9f);
	        a.SquareArea(42.1f);
	        a.CircleArea(8);
		
	}

}
