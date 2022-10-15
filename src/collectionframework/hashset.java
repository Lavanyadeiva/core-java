package collectionframework;
import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		 HashSet<String> set=new HashSet();
		 set.add("Lion");    
         set.add("Rabbit");    
         set.add("Dog"); 
         set.add("Dog");
         
         System.out.println("Elements in my hashset:"+set);
	 //avoids duplicate string
         
}}