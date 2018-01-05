package practice;

public class CalculateSum {

	public static void main(String[] args) {

		//it will calculate sum of 1 to 100
		
		int sum=0;
		for(int i=1;i<101;i++) {
			sum= sum + i;
		}
		System.out.println("Here is sum of 1 to 100 " +sum);
		
		System.out.println("--------------------");
		//boolean prints true and false statements
		boolean name = 75<90;
		System.out.println("If statement: " +name);
		
	}

}
