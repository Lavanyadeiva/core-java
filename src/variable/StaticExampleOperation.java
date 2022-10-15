package variable;

public class StaticExampleOperation {

	static int add(int x,int y) {
	return x+y;
	}
	int multiply(int a,int b) {
		return a*b;
	}
void sub(int a,int b) {
	System.out.println("Subtraction:"+(a-b));
	}
public static void main(String[] args) {
	int result=StaticExampleOperation.add(10, 7);
System.out.println("sum:"+result);
    StaticExampleOperation obj=new StaticExampleOperation();
    int mul=obj.multiply(20, 5);
 System.out.println("smultiply:"+mul); 
   obj.sub(10, 5);
	}
}
