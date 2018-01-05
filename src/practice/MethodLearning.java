package practice;

public class MethodLearning {

	public static void main(String[] args) {
		// how to create object for class
		// and also how to call an object
		// we also execute method in main
		// we don't need to create a method in main
		// format classname objectname = new classname();

		MethodLearning ob = new MethodLearning();

		ob.n(10, 35);
		ob.n(10, 38);

		String a = "PNT Learning";
		String b = "Hello World";
		ob.printt(a);
		ob.name(b);
	}

	public void name(String b) {
		System.out.println("Value of B : " + b);
	}

	public void printt(String a) {
		System.out.println("Value of A : " + a);
	}

	// this is called method
	// sum
	public void n(int i, int j) {
		int sum = i + j;
		System.out.println("Here is a sum of these two integer = " + sum);
	}
}
