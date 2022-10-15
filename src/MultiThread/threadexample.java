package MultiThread;
class RunnableThread implements Runnable
{
	public void run()
	{
		System.out.println("Implementing runnable interface,thread started running");
	}
}
public class threadexample {

	public static void main(String[] args) {
		RunnableThread t1=new RunnableThread();
		Thread t2=new Thread(t1);
        t2.start();
	}}
