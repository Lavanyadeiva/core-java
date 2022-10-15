package array;
public class averagearray {
 public static void main(String[] args) {
   int num[]=new int[7];
   num[0]=10;
   num[1]=20;
   num[2]=30;
   num[3]=40;
   num[4]=50;
   num[5]=60;
   num[6]=70;
   double average=0.00;
   int sum=0;
   //find the sum of these numbers
   for(int i=0;i<6;i++)
		    sum  = sum + num[i];
		    average = (double)sum/6;
		 System.out.println("Sum of six numbers: " +sum);
		 System.out.println("Average of six numbers: " +average);
}
}
