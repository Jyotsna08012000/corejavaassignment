package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class assign57 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();  
         
        list.add(10);  
        list.add(-20);  
        list.add(50);  
        list.add(90);  
        list.add(-15);  
          System.out.println("List before Shuffle : "+list);  
          Collections.shuffle(list);  
          System.out.println("List after shuffle : "+list);  
	}


}
