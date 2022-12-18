package Assignment;

import java.util.HashSet;
import java.util.Iterator;

public class assign59 {
	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		   
		          h_set.add("Red");
		          h_set.add("Green");
		          h_set.add("Black");
		          h_set.add("White");
		          h_set.add("Pink");
		          h_set.add("Yellow");
           System.out.println(h_set);
		 
		    Iterator<String> p = h_set.iterator();
		
		   while (p.hasNext()) {
		   System.out.println(p.next());
	}

	}

}
