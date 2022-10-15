package inheritance;
class animals{
	void animal()
	{
		System.out.println("Most favorite animal is dog");
	}
}
class dogs extends animal{
	void breed()
	{
		System.out.println("Labrador is one of the breeds");
	}
}
class Labrador extends dogs{
	void about()
	{
		System.out.println("Labradors are the most popular breeds");
	}
}
public class multileveleg {

	public static void main(String[] args) {
		animals obj=new animals();
		obj.animal();
		Labrador obj2=new Labrador();
		obj2.about();
			}}
