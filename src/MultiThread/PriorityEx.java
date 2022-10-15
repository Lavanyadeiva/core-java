package MultiThread;

public class PriorityEx extends Thread {
 public void run()
 {
	 System.out.println("Priority of thread:"+Thread.currentThread().getPriority());
 }
	public static void main(String[] args) {
		PriorityEx t1=new PriorityEx();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(NORM_PRIORITY);; //disp the lastly added one
        t1.start(); //max means 10,min means 1,norm is 5
	}}
