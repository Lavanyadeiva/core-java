package file;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {
  public static void main(String[] args) throws IOException{
	
	  FileInputStream file=new FileInputStream("D:/javaclassdemo/courses.txt");
	  BufferedReader read=new BufferedReader(new InputStreamReader(file));
	String line;
	while((line=read.readLine()) != null){
		System.out.println(line);
	}}
	  }
  
