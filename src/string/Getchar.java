package string;
 
import java.util.Arrays;

public class Getchar {

public static void main(String[] args) {
		String s="JAVA";
		char[]dest=new char[4];
		s.getChars(0,4,dest,0);
		System.out.println(Arrays.toString(dest));
	}

}
