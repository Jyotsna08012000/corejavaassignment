package Assignment;


	class shape1 {
		public void print_shape1(){
	        System.out.println("This is a shape!");
	    }
	}
	    class rectangle1 extends shape1{
	        public void print_rect1(){
	            System.out.println("This is rectangular shape ");
	        }
	    }
	    class circle1 extends shape1{
	        public void print_circle1(){
	        	System.out.println("This is circular shape");
	            
	        }
	    }
	    class square1 extends rectangle1{
	        public  void print_square1(){
	            System.out.println("Square is a rectangle");
	        }
	    }
	    public class assign34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square1 sq = new square1();
        sq.print_shape1();
        sq.print_rect1();

	}

}
