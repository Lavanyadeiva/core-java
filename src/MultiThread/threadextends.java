package MultiThread;

class ExtendingThread extends Thread
{
	public void run()
	{
		System.out.println("Extending thread class, thread started running");
	}
}
public class threadextends {

	public static void main(String[] args) {
		ExtendingThread t1=new ExtendingThread();
        t1.start();
	}}
