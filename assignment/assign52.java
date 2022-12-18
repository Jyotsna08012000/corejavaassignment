package Assignment;

import java.util.ArrayList;

public class assign52 {
	public static void main(String[] args) {
		 ArrayList<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		 
		  System.out.println(list_Strings);
		 
		  list_Strings.set(2, "Yellow");
		  
		  System.out.println(list_Strings);
	}
}
