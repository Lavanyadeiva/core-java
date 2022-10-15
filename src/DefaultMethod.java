interface message{
	default void say()
	{
		System.out.println("Hello,this is default method");
	}
	void say1(String s);
}
public class DefaultMethod implements message
{
 public void say1(String s)
 {
	 System.out.println(s); 
 }
	public static  void main(String[] args) {
		{
			DefaultMethod obj=new DefaultMethod();
			obj.say();
			obj.say1("Hello,this is method");
		}

	}

}
