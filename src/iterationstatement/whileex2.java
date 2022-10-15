package iterationstatement;
import java.util.Scanner;
public class whileex2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=input.nextInt();
//while loop condition
		//sum of positive numbers
		while(number>=0) {
			//adding only positive numbers
			sum+=number;
		System.out.println("Enter a number");
		      number = input.nextInt();
	    } //when negative number given the loop closes and displays the total sum 
		   
	    System.out.println("Sum = " + sum);
	    input.close();
}}

