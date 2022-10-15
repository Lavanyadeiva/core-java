package array;

import java.util.Scanner;

public class SummingElements {

	public static void main(String[] args) {
		int length, sum=0;
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length");
		length=sc.nextInt();
	
	int[]array=new int[length];
	    	    
	    for(int i=0;i<length;i++)
	    {
	    	System.out.println("Enter the array element "+(i+1));
	    	array[i]=sc.nextInt();
	   }
	    for(int i=0;i<length;i++)
        {
    		sum+=array[i];
    	}
    	System.out.println("sum of array elements:"+sum);
}}
