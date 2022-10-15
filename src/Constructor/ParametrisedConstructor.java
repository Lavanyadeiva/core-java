package Constructor;

public class ParametrisedConstructor {

	public String name;
	public long population;
	public ParametrisedConstructor(String name,long population) { //paramaterised constructor
		this.name=name;
		this.population=population;
	}
public void display()
{
	System.out.println("City name:"+name);
	System.out.println("Population number:"+population);
}
	public static void main(String[] args) {
		ParametrisedConstructor metro,metro1;
		metro=new ParametrisedConstructor("Bangalore",35720029);
		metro1=new ParametrisedConstructor("Chennai",72524740);
		metro.display();
		metro1.display();		
	}
}
