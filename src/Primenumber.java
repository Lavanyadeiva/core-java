
public class Primenumber {

public static void main(String[] args) {
	int num=7;
	int i;
	boolean value=false;
	for(i=2;i<=num/2;++i)
	{
		if(num%i==0) //non prime condition
		{
			value=true;
			break;
		}
		++i;
	}
	if(!value)
		System.out.println(num+"is a prime number");
	else
		System.out.println(num+"is a Non prime number");
	}

}
