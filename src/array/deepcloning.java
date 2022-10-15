package array;
import java.util.*;

public class deepcloning {

	public static void main(String[] args) {
		
		int intarray[]= {0,1,2,3,4,5,6,7,8,9};
		String str="lavs deiva mani sai avi,gowtham,abar";
		int cloneArray[]=intarray.clone();
		System.out.println(intarray==cloneArray);// deep cloning - array location differs
		System.out.println(intarray+" - "+cloneArray);//prints location id
		for(int i=0;i<cloneArray.length;i++)
		{
			
			System.out.println(cloneArray[i]+" "+(intarray[i]==cloneArray[i]));
	//		System.out.println(intarray[i]==cloneArray[i]);
		}
		//displaying the length of array
		System.out.println("Length of array: " +intarray.length);
		StringTokenizer st=new StringTokenizer(str);
				while(st.hasMoreElements()) {
					System.out.println(st.nextToken());
				}
	}
}

