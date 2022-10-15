package file;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {

	public static void main(String[] args)throws IOException {
	 File f=new File("D:/javaclassdemo/module.txt");
	 if(f.createNewFile())
	 {
		 System.out.println("File is created");
	 }
	 else
	 {
		 System.out.println("File already existed"); //it creates a file if already a file is present then the o/p is already exists
	 }
	 boolean status;
	 Path p=Paths.get("D:/javaclassdemo/module.txt");
	 status=Files.isWritable(p);
	      System.out.println("Is file writtable? ;"+status);
	 status=Files.isReadable(p);
	      System.out.println("Is file Readable? ;"+status);
     f.getPath();
          System.out.println(" Path:"+f.getPath());
	 f.getAbsolutePath();
          System.out.println("Absolute Path:"+f.getAbsolutePath());
     f.getCanonicalPath();
          System.out.println("Canonical path:"+f.getCanonicalPath());
	
	}}
 