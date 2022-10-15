package inheritance;
class animal{
	void animal()
	{
		System.out.println("Animals are of two types:pet and wild animal");
	}
}
class dog extends animal 
{
	void pet()
	{
	  System.out.println("Example of pet animal is Dog");
    }
}
class lion extends animal
{
	void wild()
	{
	 System.out.println("Example of wild animal is Lion");
	}
}
public class heirarchialeg {
  public static void main(String[] args) {
	  dog obj=new dog();
	  obj.animal();
	  obj.pet();
	  lion obj1=new lion();
	  obj1.wild();
}}
