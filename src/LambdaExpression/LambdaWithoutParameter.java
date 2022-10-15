package LambdaExpression;

public class LambdaWithoutParameter {
	public static void main(String[] args) {
			int speed=100;
			Runnable r= new Runnable() {
			        public void run() {
					System.out.println("Running at the speed of" +speed);}
			};
					r.run();
	}}





