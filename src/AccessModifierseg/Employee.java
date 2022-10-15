package AccessModifierseg;

public class Employee {
	String name;
	int age;
    double salary;
public Employee(String name,int age,double salary){ //parameterised constructor
	this.name = name; //this keyword
	this.age = age;
	this.salary = salary;
}
public void display() {
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
	System.out.println("Salary:"+salary);
	}
public static void main(String[] args) {
	Employee obj=new Employee("Lavs",23,50000);
	obj.display();
}
}