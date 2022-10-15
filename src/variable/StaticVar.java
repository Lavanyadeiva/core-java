package variable;
class StaticVar
{
	//static variable
	public static double fees;
	public static String name="Lavanya";

public static void main(String[] args) {
	StaticVar.fees=7000.77;
	System.out.println(StaticVar.name+"Student fees:"+StaticVar.fees);
	}

}
