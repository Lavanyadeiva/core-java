package Patterns;

public class multitable {

	public static void main(String[] args) {
		int num=7;
		for(int i=1;i<=10;++i)
		{
			System.out.printf("%d*%d = %d \n",num,i,num*i);
		}
		System.out.println("  ");
		int value=5;
		for(int j=1;j<=10;++j)
		{
			System.out.printf("%d*%d = %d \n",value,j,value*j);
		}
			
	}}
