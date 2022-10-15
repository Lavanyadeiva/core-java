
public class Compare{
public static void main(String[] args) {
			  String str="Java"; //str is a referable variable
			  String str1=new String("Java");
			  String str2=new String("JAVA");
			  //by using == or equals()
			  
			  if(str == str1) // operator so the o/p is not equal
				   System.out.println("both are equal");
			  else
				   System.out.println("both are not equal");  
				
			  if(str.equals(str1))
				   System.out.println("both are equal");
			  else
				   System.out.println("both are not equal");
			}
}

