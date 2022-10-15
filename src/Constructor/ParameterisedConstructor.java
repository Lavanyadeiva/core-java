package Constructor;

public class ParameterisedConstructor {
    int i;
    ParameterisedConstructor(int i){
    	
    	System.out.println("Student count for playing carrom:" +i);
    	}
	public static void main(String[] args) {
    	ParameterisedConstructor a=new ParameterisedConstructor('A');//prints ASCII value
    	ParameterisedConstructor b=new ParameterisedConstructor(2);
    	ParameterisedConstructor c=new ParameterisedConstructor(3);
    	ParameterisedConstructor d=new ParameterisedConstructor(4);
	}}
