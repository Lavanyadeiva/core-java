package exceptionExample;

import java.io.IOException;

public class TestThrowandThrows {
	//defining a user defined method which throws Arithmeticexception
static void method()throws IOException
{
	System.out.println("inside the method()");
	throw new IOException("throwing ArithmeticException");
}
public static void main(String[] args) {
	try
	{
		method();
	}
catch(Exception e)
	{
	System.out.println("caught in main()method");
	}}}
