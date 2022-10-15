package exceptionExample;

import java.io.IOException;

public class throwexample {
    static void Age(int age) {
       if(age < 18) 
 {
 try {
	throw new IOException("Access denied must be at least 18 years old to watch movie");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 }
       else 
 {
 System.out.println("Access granted to watch movie");
 }
 }
public static void main(String[] args) {
Age(18);
}}
