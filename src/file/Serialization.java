package file;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args)throws IOException {
	      Employee e=new Employee();
	      e.name="Lavs";
	      e.address="Tuticorin";
	      FileOutputStream fo=new FileOutputStream("D://javaclassdemo//module.txt");
	      ObjectOutputStream os=new ObjectOutputStream(fo);
	      os.writeObject(e);
	      os.close();
	      fo.close();
	      System.out.println("Serialized data is saved in D://javaclassdemo//module.txt");
	}
}

