package MultiThread;
class Table
{
	synchronized static void printTable(int n)
	{
		for(int i = 1;i<=5;i++)
		{
			System.out.println(+n+"*"+i+"="+(n*i));
			try {
				Thread.sleep(500);
			}
           catch(Exception e)	
           {
        	   System.out.println("Exception:"+e);
           }
           }}}
class MyThread1 extends Thread
{
	public void run()
    {
        Table.printTable (1);
    }
}
class MyThread2 extends Thread
{
	public void run()
    {
        Table.printTable (3);
    }
}
public class SynchronizationExample {

	public static void main(String[] args) {
		Table obj=new Table();
		MyThread1 a=new MyThread1();
		MyThread2 b=new MyThread2();
		
		
a.start();
b.start();

}}
