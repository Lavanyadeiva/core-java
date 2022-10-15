package variable;

public class Localvariable {
public void StudentAge()
{
	//local variable
	int age=0;
	age=age+7;
	System.out.println("Student age is:"+age);
}
public static void main(String[]args) {
	//local variable
	Localvariable temp=new Localvariable();//constructor
	temp.StudentAge();

}

}
