package variable;
class Stud {
	static String college="EDUBRIDGE";
	static int count=0;
		String name;
		int regno;
	static void college()
		{
		college="EDUBRIDGE"; //in static func,static variable can only be used
		}
	Stud(String name,int r) //this- is for same class variable name,parametrised variable name 
		{
		this.name=name;  
		regno=r;
		count++;
		System.out.println(count);
		}
	void display()
		{
		System.out.println(regno+" "+name+" " +college+" " +count);
		
		}
		}
public class StaticMethod {
public static void main(String[] args) {
		Stud.college();
		Stud s1= new Stud("Amrutha",700);
		Stud s2= new Stud("Lavanya",701);
		
		Stud.college();
		s1.display();
		s2.display();
		
}


}
