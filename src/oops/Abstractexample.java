package oops;
abstract class shapes {
	 abstract void method();
}
class square extends shapes{
	  void method()
	  {
		  System.out.println("I am drawing square");
	  }
}
class pentagon extends shapes{
	  void method()
	  {
		  System.out.println("I am drawing pentagon");
	  }
}
public class Abstractexample {

	public static void main(String[] args) {
		shapes obj=new pentagon();  //cannot create obj for abstract class (here parent class)
		obj.method();               //but can create for child class
		}}
