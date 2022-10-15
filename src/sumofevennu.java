import java.util.Scanner;

public class sumofevennu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		int sum=0,i;
		for(i=0;i<num;i+=2)
			sum=i;
		System.out.println("Sum of even numbers is:"+sum);
	}}
