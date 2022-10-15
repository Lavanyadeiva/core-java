package variable;
class Marks
{
	//instance variables defined in the class
	int Chemistrymark;
	int Mathsmark;
	int Sciencemark;	
}

public class InstanceClass {

public static void main(String[] args) {
//Student1
	 Marks stu1=new Marks();
	 stu1.Chemistrymark=97;
	 stu1.Mathsmark=90;
	 stu1.Sciencemark=95;
		 
 //Student2
	Marks stu2=new Marks();
	stu2.Chemistrymark=87;
	stu2.Mathsmark=89;
	stu2.Sciencemark=85;
		 
//displaying marks of stu1
	System.out.println("Mark of the first student");
	System.out.println(stu1.Chemistrymark);
	System.out.println(stu1.Mathsmark);
	System.out.println(stu1.Sciencemark);

//displaying marks of stu2
    System.out.println("Mark of the second student");
    System.out.println(stu2.Chemistrymark);
    System.out.println(stu2.Mathsmark);
    System.out.println(stu2.Sciencemark);
}

}


