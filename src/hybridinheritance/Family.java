package hybridinheritance;

interface Grandfather
{
 public void show_grandfather();
}

interface Father extends Grandfather
{
 public void show_Father();
}

interface Daughter extends Grandfather
{
 public void disp_Daughter();
}

public class Family  implements Father,Daughter{

	public void disp_Grandfather()
 {
 System.out.println("I'm her Grandfather");
 }
 public void disp_Father()
 {
 System.out.println("I'm her Father");
 }
 public void disp_Daughter()
 {
 System.out.println("I'm his Daughter");
 }

 public static void main(String[] args) {
 
	Family obj1= new Family();
 obj1.disp_Grandfather();
 obj1.disp_Father();
 obj1.disp_Daughter();
}
@Override
public void show_grandfather() {
	// TODO Auto-generated method stub
	
}
@Override
public void show_Father() {
	// TODO Auto-generated method stub
	
}}

