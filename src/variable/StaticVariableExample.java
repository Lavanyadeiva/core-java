package variable;

import java.io.IOException;

class Student {
	static String college="VCTW";
		String name;
		int regno;
		
	Student(String n,int r)
		{
		this.name=n;
		this.regno=r;
		}
		void display()
		{
		System.out.println(regno+ ""+name+"" +college);
		}
		}
public class StaticVariableExample {
		public static void main(String[] args) {
		Student s1= new Student("Amrutha",700);
		Student s2= new Student("Lavanya",701);
		s1.display();
		s2.display();
		}}



