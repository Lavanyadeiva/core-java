import java.util.Scanner;

public class factorial {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the factorial number");
	int num=sc.nextInt();
	long factorial=1;
	for(int i=num;i>0;i--) {
		factorial=i*factorial;
	}
System.out.println("Factorial of "+num+" is "+factorial);
}
}
