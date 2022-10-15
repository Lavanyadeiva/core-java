//single inheritance example
package inheritance;
class basiccolours 
{ 
 public void threecolours() 
 { 
 System.out.println("There are 3 primary colours"); 
 } 
} 
 
class colourname extends basiccolours
{ 

 public void colourname() 
 { 
 System.out.println("Red,Blue and Yellow"); 
 } 
} 
public class singleinheritance{
public static void main(String[] args) {
	colourname d = new colourname(); 
    d.threecolours(); 
    d.colourname();
}}