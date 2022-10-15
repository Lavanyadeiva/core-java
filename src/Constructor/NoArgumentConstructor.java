package Constructor;

public class NoArgumentConstructor {
  int i;
  NoArgumentConstructor()
  {
	  i=70;
	  System.out.println("Creating noargument constructor");
	  System.out.print("i="+i);
  }
  public static void main(String[] args) {
NoArgumentConstructor skill=new NoArgumentConstructor();
}
  }

