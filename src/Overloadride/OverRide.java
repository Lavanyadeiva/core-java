package Overloadride;
class Super{
	int x;
    Super(int x)
    {
    	this.x=x;
    }
    void disp()
    {
    	System.out.println("Super x ="+x);
    }
}
class Sub extends Super
{
   int y;
   Sub(int x,int y)
   {
	   super(x);
	   this.y=y;
   }
   void disp()
   {
   	System.out.println("Super x ="+x);
   	System.out.println("Sub y ="+y);
   }
}
public class OverRide {

	public static void main(String[] args) {
		Sub obj=new Sub(100,200);
		obj.disp();
	}}


