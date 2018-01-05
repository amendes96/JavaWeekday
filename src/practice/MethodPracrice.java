package practice;

public class MethodPracrice {

	public static void main(String[] args) {
		MethodPracrice myCar = new MethodPracrice();
			myCar.Car("Lamboughini");
			myCar.number(2015);
			myCar.House("White House");
			myCar.hatemath(1, 1);
			myCar.ihatemath(20, 10);
			
			//reverse
			String a = "Reverse";
			myCar.justreverse(a);
			myCar.justreverse("Java");
			

	}
	
	public void Car(String x) {
	System.out.println("Car Name: " +x);
	}
	
	public void number(int y) {
		System.out.println("Year : " +y);
	}
	
	public void House(String a) {
		System.out.println("House Name: " +a);
	}
	
	public void hatemath(int d, int e ) {
		int sum = d+e;
		System.out.println("Sum : " +sum);
	}
	
	public void ihatemath(int f, int g) {
		int subtract = f-g;
		System.out.println("Sum : " +subtract);
	}
	//reverse
	public void justreverse(String a) {
		for(int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println(" : For Reversing");
	}
	
}
