package Assignment;
abstract class Mark{

	abstract float getPercentage();

}

class A1 extends Mark{

	float sub1 , sub2 , sub3;
    float per=0;
    A1(float a , float b, float c){
    sub1 = a;
    sub2 = b;
    sub3 = c;    

 }
 @Override
    public float getPercentage(){
    per = (sub1 + sub2 + sub3 )/300* 100; 
        return per;

    }

}

class B1 extends Mark{

    float sub1 , sub2 , sub3 , sub4;
    float per=0;
    B1(float a , float b, float c,float d){
    sub1 = a ;
    sub2 = b;
    sub3 = c;    
    sub4 = d;

}

  @Override
   public float getPercentage(){
    per = (sub1 + sub2 + sub3 + sub4 )/400* 100; 
        return per;

    }

}

	


public class assign30 {
	public static void main(String[] args) {
		 A1 ob = new A1(77f, 96f, 782.2f);
	        System.out.println("Student 1 Per: " +ob.getPercentage());

	        B1 obj = new B1(69f , 66.7f , 79.2f , 82f);
	        System.out.println("Student 2 Per: " +obj.getPercentage());

	}

}


