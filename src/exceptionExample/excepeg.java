package exceptionExample;

class excepeg {
	
		public static void main(String[] args) {
		try 
		{
		int[] numbers = {1, 2, 3,4,5,6};
		System.out.println(numbers[70]);
		} 
		catch (Exception e) 
		{
		System.out.println("Some Error in code.");
		}
}}