package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
	public static void main(String[] args) {
		LinkedList<Integer> numbers=new LinkedList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		System.out.println("List of elements:"+numbers);
		System.out.println("Set value from list:"+numbers.set(3, 5));
		System.out.println("List of elements:"+numbers);
		System.out.println("Get value from list:"+numbers.get(2));
		System.out.println("List of elements:"+numbers);
		System.out.println("Removing elements from list:"+numbers.remove(3));
		System.out.println("List of elements:"+numbers);
		numbers.add(3, 4);
		numbers.addFirst(20);
		numbers.addLast(5);
		System.out.println("List of elements:"+numbers);
		Iterator<Integer> itr=numbers.descendingIterator();  
		
		while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }

}}

	
