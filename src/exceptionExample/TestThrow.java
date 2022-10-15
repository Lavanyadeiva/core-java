package exceptionExample;

import java.io.IOException;

public class TestThrow {
	//define method
	public static void checknum(int num)
	{
		if(num<1)
		{
			try {
				throw new IOException();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	else
	{
		System.out.println("Square of "+num+" is" +" "+(num*num));
	}
	}
	public static void main(String[] args) {
 TestThrow obj=new TestThrow();
    obj.checknum(7);
 System.out.println("Rest of the code");
	}}
