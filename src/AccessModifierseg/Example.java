package AccessModifierseg;

public class Example {
	 Example(int i,int j)
	 {
		 System.out.println("Parameterised constructor");
	 }
  Example(int i, int j, int k)
  {
	  System.out.println("Parameterised constructor 1");  
  }
	public static void main(String[] args) {
		Example obj=new Example(2,4,6); //here 3 num gn so automatically it goes for int i,j,k
	}}