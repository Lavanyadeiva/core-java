package collectionframework;

import java.util.ArrayList;

public class arraylist {
	
   public static void main(String[] args) {
	 ArrayList<String> list=new ArrayList<String>();
		list.add("Music");
		list.add("Airpods");
		list.add("Earphones");
		list.add("Zebronics");
		list.set(2, "Speaker");
     ArrayList<Integer> numbers=new ArrayList<Integer>();
       numbers.add(10); 
       numbers.add(50); 
       numbers.add(70); 
 System.out.println(numbers);
 System.out.println("List of elements:"+list);
 System.out.println("Get value from list:"+list.get(1));
 System.out.println("Set value from list:"+list.set(0," Earphones"));
 System.out.println("List of elements:"+list);
 System.out.println("Removing elements from list:"+list.remove(3));
 System.out.println("List of elements:"+list);
	}

}
