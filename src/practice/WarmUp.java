package practice;

public class WarmUp {

	public static void main(String[] args) {
		int[] number = {10, 90, 0, -15,-23, -28};
		//to find positive and negative numbers
		for (int i=0; i<number.length; i++) {
			if (number[i]>0) {
				System.out.println("Positive Numbers : " + number[i]);
			}else if(number[i]<0) {
				System.out.println("Negative Numbers : "+number[i]);
			}else {
				System.out.println("Zero " +number[i]);
			}

}
	}
}
