package oops;
class Languages
{
	void know()
	{
		System.out.println("I know 3 languages");
	}
}
class Tamil extends Languages
{
	void know()
	{
		System.out.println("I can speak and read Tamil");
	}
}
class English extends Languages
{
	void know()
	{
		System.out.println("I can speak and read English");
	}
}
class Hindi extends Languages
{
	void know()
	{
		System.out.println("I can speak and read Hindi");
	}
}
public class polymorphism {

	public static void main(String[] args) {
		Languages obj=new Languages();//creating obj for languages
		obj.know();
		Tamil a=new Tamil(); //creating obj for tamil
		a.know();
		English b=new English();//creating obj for english
		b.know();
		Hindi c=new Hindi();//creating obj for hindi
		c.know();
		}}
