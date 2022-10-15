package iterationstatement;
import java.util.Scanner;

public class SumExample {
     private static Scanner input;

	public static void main(String[] args) {
    	 int sum=0;
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the numbers");
        int number=sc.nextInt();
//while and dowhile loop for unknown iterations
        while(number>=0)
        {
     	 sum+=number;  
 
        System.out.println("Enter the numbers");
        number=sc.nextInt();
     }
     System.out.println("Sum = " + sum);
     input.close();   
	}
} //when we give a neg num the loop terminates
