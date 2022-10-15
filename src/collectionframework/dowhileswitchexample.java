package collectionframework;
import java.util.*;

public class dowhileswitchexample {
   public static void main(String[] args) {
		double a,b,answer;
		int choice,condition;
		Scanner obj=new Scanner(System.in);
		do
		{
		System.out.println(".....Arithmetic Menu Calculation......");
		System.out.println("press 1 for addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for division");
		System.out.println("press 0 for exit");
		 
		choice=obj.nextInt();
		System.out.println("Enter your choice");

		switch(choice)
		{
		case 1:
		System.out.println("Enter the number for addition");
		a=obj.nextDouble();
		b=obj.nextDouble();
		answer=a+b;
		System.out.println("The sum of the numbers"+answer);
		break;
		case 2:
		System.out.println("Enter the number for subtraction");
		a=obj.nextDouble();
		b=obj.nextDouble();
		answer=a-b;
		System.out.println("The subtraction of the numbers"+answer);
		break;
		case 3:
		System.out.println("Enter the number for multiplication");
		a=obj.nextDouble();
		b=obj.nextDouble();
		answer=a*b;
		System.out.println("The multiplication of the numbers"+answer);
		break;
		case 4:
		System.out.println("Enter the number for division");
		a=obj.nextDouble();
		b=obj.nextDouble();
		answer=a/b;
		System.out.println("The answer is"+answer);
		break;
		case 5:
		System.exit(0);
		default:
		System.out.println("Invalid choice!");

		}
		System.out.println("press 7 for continue or press 0 to exit");
		 condition = obj.nextInt();

		}
		while(condition==7);
}}
