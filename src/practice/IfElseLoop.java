package practice;

public class IfElseLoop {

	public static void main(String[] args) {
		
		int a=7;
		String name = "Hello";
		
		if(name.equals("Hello")) {
			System.out.println("I am printing Hello");
		}
		else {
			System.out.println("I am printing hello");
		}
		
		
		if(a>8) {
			System.out.println("a is greater than 8!!!");
		}
		else {
			System.out.println("a is grater than 8!!!");
		}

		
		/*else if statement if we have multiple
		 * statements
		 */
		int x=120;
		if(x>200) {
			System.out.println("The number is less than 120");
		}
		
		else if(x>120) {
			System.out.println("The number is greater than 120");
		}
		else if(x>150) {
			System.out.println("The number is greater than 150");
		}
		else {
			System.out.println("the number is equal to 120");
		}
	}

}
