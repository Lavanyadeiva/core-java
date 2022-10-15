package SelectionStatement;
public class switchexample {
	public static void main(String[] args) {
        int number = 40;
	    String size;
 // switch statement to check size
	    switch (number) {

	      case 10:
	        size = "Small";
	        break;

	      case 30:
	        size = "Medium";
	        break;

	      // match the value of week
	      case 40:
	        size = "Large";
	        break;

	      case 70:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;
	        }
	    System.out.println("Size: " + size);
	  }}
