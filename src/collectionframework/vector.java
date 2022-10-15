package collectionframework;
import java.util.Vector;
public class vector {
	public static void main(String[] args) {
		 Vector<String> vec = new Vector<String>();  
		 vec.add("Lavs");  
         vec.add("Amrutha");  
         vec.add("Jayasri");  
         vec.add("Kags"); 
     System.out.println("List of elements:"+vec);
       vec.addElement("Deva");  
       vec.addElement("Ammu");  
       vec.addElement("Anu");
       vec.addElement("Harini");
     System.out.println("List of elements:"+vec);
	   vec.remove(2);
	 System.out.println("List of elements:"+vec);
	 System.out.println("Element at index 0 is = "+vec.get(0)); 
	
	}

}
