package constructor;

public class ConstructorClass {

	ConstructorClass(){	//constructor should have the same name as class name
		System.out.println("this is constructor");
	}

	public static void main(String[] args) {
		
		ConstructorClass cba = new ConstructorClass();
		cba.sum(3,5);

	}

	public void sum(int i, int j) {
		int sum = i+j;
		System.out.println(sum);
		
	}

}
