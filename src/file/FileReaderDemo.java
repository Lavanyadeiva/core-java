package file;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		
	 FileReader fr=new FileReader("D:/javaclassdemo/courses.txt");
	 BufferedReader br=new BufferedReader((fr));
int i;
while((i=br.read())!=-1)
{
	System.out.print((char)i);
}
	br.close();
	fr.close();
	
	}}
