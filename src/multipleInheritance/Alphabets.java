package multipleInheritance;
interface PQR extends ABC,XYZ
{
	public void print_PQR();
}
class family implements PQR{
	public void print_ABC()
	{
		System.out.println("Hi"); 
	}
	public void print_XYZ()
	{
		System.out.println("Hello");
	}
	public void print_PQR() 
	 { 
	 System.out.println("How are you"); 
	 }
	@Override
	public void print_abc() {
		// TODO Auto-generated method stub
		
	}
}
public class Alphabets {

	public static void main(String[] args) {
			family d = new family(); 
			 d.print_ABC(); 
			 d.print_XYZ();
			 d.print_PQR();
	}}