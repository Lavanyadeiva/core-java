
public class shallowcopy {

public static void main(String[] args) {
		int intArray[][]= {{1,2,3,4,5},
				{6,7,8,9,10}};
		int cloneArray[][]=intArray.clone();
		System.out.println(intArray[0][2]==cloneArray[0][2]);//1st [] is row,2 nd [] is columns
		System.out.println(intArray[1]==cloneArray[1]);
}
}	
	


