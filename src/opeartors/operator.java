package opeartors;

public class operator {
	public static void main(String[]args) {
//assignment operator
		int num1,num2;
		num1=20;
		System.out.println(num1);
		num2=10;
		System.out.println(num2);
		int num3=5;
//arithmetic operator
		//addition
		//subtraction
		//multiplication and division
		//modulo
		int result=num1+num2;
	    int output=num1-num2;
	    int answer=num1*num2;
		int result1=num1/num2;
		int value=num1%num2;
		
		System.out.println("addition ="+result);
		System.out.println("subtraction="+output);
		System.out.println("multiplication="+answer);
		System.out.println("division="+result1);
		System.out.println("modulo="+value);
//unary operator
		double number=num1;
		boolean flag=true;
		System.out.println("number="+ +number);
		System.out.println("number="+ -number);
	    
		System.out.println("number="+ ++number);//now value is 20+1=21 preincrement
		System.out.println("number="+ --number);//so 21-1=20
		System.out.println("number="+ number++);//20 post increment
		System.out.println("number="+ number--);//21
		System.out.println("number="+ number);//20
		System.out.println("!flag=" +!flag);
		System.out.println("flag=" +flag);
//relational operator

		if(num1>num2)
		  {
			  System.out.println("number1 is Greater");
		  }
		  if(num1<num2)
		  {
			  System.out.println("number2 is smaller");
		  }
		  if(num1==num2)
		  {
			  System.out.println("number1 and number2 are equal");
		  }
//ternary operator
		  System.out.println("Ternary operator num1>num2?True:False"+(num1>num2?true:false));
//logical operator
		  boolean answer2;
		  //Logical AND
		  answer2=(num1>num2)&&(num3>num2);
		  System.out.println(answer2);
		  //Logical OR
		  answer2=(num1<num2)&&(num3<num2);
		  System.out.println(answer2);
//bitwise operator
		  /*20=0001 0100
		   * 10=0000 1010
		   */
		   int a=0;
		   a=num1&num2;
		   System.out.println("num1&num2=" +a);//0=0000 0000
		   a=num1|num2;
		   System.out.println("num1|num2=" +a);//30=0001 1110
		   a=num1^num2;
		   System.out.println("num1^num2=" +a);//30=0001 1110
		   a=~num1;
		   System.out.println("~num1=" +a);//1110 1011
//shift operator
		   a=num1>>2;//right shift 
		   System.out.println("num1>>2=" +a); //0000 0101 
		   a=num1<<2;//left shift
		   System.out.println("num1<<2=" +a);//0101 0000
		  
		}
		
		}
		
		
		
