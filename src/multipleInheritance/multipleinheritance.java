package multipleInheritance;
interface webdevelopment extends frontend,backend
{
	public void show_webdevelopment();
}
class java implements webdevelopment{
	public void show_frontend()
	{
		System.out.println("JAVA can be used as frontend"); 
	}
	public void show_backend()
	{
		System.out.println("JAVA can also be used as backend");
	}
	public void show_webdevelopment() 
	 { 
	 System.out.println("JAVA is also used for developing web page"); 
	 }
}
public class multipleinheritance {

	public static void main(String[] args) {
		
			java d = new java(); 
			 d.show_frontend(); 
			 d.show_backend();
			 d.show_webdevelopment();
	}}	

