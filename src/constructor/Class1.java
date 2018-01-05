package constructor;

public class Class1 {

	public Class1() {
		System.out.println("this is a constructor!!!");
	}

	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.subtract(5, 1);

	}

	public void subtract(int i, int j) {
		int sub = i - j;
		System.out.println(sub);

	}

}
