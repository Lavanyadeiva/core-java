package Constructor;

public class thisconstructor {

	thisconstructor() 		
{
	this(2); 		
	System.out.println("Default Constructor.");
	} 
	
	thisconstructor(int i) 		
{
	this(2,3);  		
	System.out.println("Constructor with one argument.");
	}
	
	thisconstructor(int i, int j) 		
{
	this(2,3,4); 	
	System.out.println("Constructor with two arguments.");}  		
	
	thisconstructor(int i, int j, int k) 		
{
	System.out.println("Constructor with three arguments.");
	} 		
public static void main(String[] args) { 
	thisconstructor constructorThis = new thisconstructor();
	} }
