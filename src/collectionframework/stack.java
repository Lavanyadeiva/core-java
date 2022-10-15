package collectionframework;
import java.util.Stack;
public class stack {
	public static void main(String[] args) {
		Stack<Integer> stk= new Stack<Integer>(); 
		System.out.println("Is stack empty?:"+stk.isEmpty());	
		stk.push(70);  
		stk.push(100);  
		stk.push(40);  
		stk.push(170);  
		System.out.println("After Insertion");
		System.out.println("Is stack empty?:"+stk.isEmpty());
	System.out.println("Elements in Stack: " + stk);  
		Integer element=stk.pop();
	System.out.println("Removed Element in Stack: " + element);  
	System.out.println("Elements in Stack: " + stk);  	
		Integer top=stk.peek();
		System.out.println("Top Element in Stack: " + top);  
		System.out.println("Elements in Stack: " + stk);  
	}  
		}  
	


