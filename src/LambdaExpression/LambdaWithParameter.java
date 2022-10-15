package LambdaExpression;

public class LambdaWithParameter {
	public static void main(String[] args) {
		int speed=300;
		Runnable1 r= (int carSpeed)-> {
				System.out.println("Running at the speed of:" +carSpeed);
				};
				r.run(speed);
}
		}


