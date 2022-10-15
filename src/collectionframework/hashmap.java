package collectionframework;
import java.util.HashMap;
public class hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(0, "pink");
		map.put(1, "yellow");
		map.put(2, "pastel colours");
		map.put(3, "blue");
		map.put(4, "red");
	System.out.println("The colours in this map are:"+map);
	    map.replace(2, "white");
	System.out.println("The colours in this map are:"+map);
	    map.remove(4, "red");
    System.out.println("The colours in this map are:"+map);
    System.out.println("The colour is:" +map.get(2));
    
 //checking if clr pink is present
    if(map.containsValue("pink")) {
    	System.out.println("Pink is present");
   
    if(!map.containsValue("blue")) {
        
        map.put(1,"blue");  //add clr if not in the list
      }

     System.out.println("Colours:\n" + map);
 map.put(5, null);
 System.out.println("Colours:\n" + map);
    }}}
