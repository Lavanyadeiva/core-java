package oops;
abstract class birds{
	abstract void hatchling();
}
class eagle extends birds{
	void hatchling()
	{
		System.out.println("The young ones of the eagle are called eaglets");
	}
}
class duck extends birds{
	void hatchling()
	{
		System.out.println("The young ones of the duck are called ducklings");
	}
}
public class abstractclassexample {

	public static void main(String[] args) {
		birds obj=new duck();
		obj.hatchling();
}}
