package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
		
public class OutputStreamExample {
	public static void main(String args[]) {
		try {
		OutputStream obj = new FileOutputStream("D:/javaclassdemo/module.txt");
		obj.write(70);
		obj.write(60);
		obj.write(20);
		obj.close();
		System.out.println("Successfully created and written the file.");
		} 
		catch (IOException e) {
		System.out.print("Exception");
		}
	} }

	


