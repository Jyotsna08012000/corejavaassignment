package Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class assign49 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
	    numbers.add(1);
	    numbers.add(3);
	    numbers.add(2);
	    System.out.println("ArrayList: " + numbers);

	    
	   Iterator<Integer> itr= numbers.iterator();
	   while(itr.hasNext()) {
		   System.out.println(itr.next());
		   
	}
	   
	}

}
