package iterationstatement;

public class foreachloop {
	//sum of all elements in the array
	public static void main(String[] args) {
			//an array of numbers
			int[] numbers= {3,6,7,-3,0,-5};
	        int sum=0;
	        //for each loop for array 
	       //syntax for(dataType item : array){...}
	        for(int number:numbers) {
	        	sum+=number;
	        }
	    System.out.println("The sum of array elements are:"+sum);    
		}}


