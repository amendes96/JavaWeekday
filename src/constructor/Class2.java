package constructor;

public class Class2 {
	
	Class2(int x, int y) {
		int z = x + y;
		System.out.println(z);
	}
	
	Class2(String x){
		System.out.println(x);
	}
	
	Class2(){
		System.out.println("this is a default constructor");
	}
	
	public static void main(String[] args) {
		
		Class2 obj2 = new Class2(4, 4);
		Class2 obj3 = new Class2("Hello");
	
	}

}
