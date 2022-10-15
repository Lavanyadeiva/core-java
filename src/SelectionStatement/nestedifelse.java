package SelectionStatement;
public class nestedifelse {
	public static void main(String[] args) {
// declaring double type variables
	    Double a= -1.0,b= 4.5,c= -5.3,largest;
// checks if n1 is greater than or equal to n2
	    if (a>=b) {
// if...else statement inside the if block
// checks if n1 is greater than or equal to n3
	     if (a>=b) {
	        largest = a;
	      }
         else {
	        largest = b;
	      }
	    }else {
// if..else statement inside else block
// checks if n2 is greater than or equal to n3
	      if (b >=c) {
	        largest =b;
	      }
 else {
	        largest = c;
	      }
	    }
System.out.println("Largest Number: " + largest);
	  } }


