package practice;

public class Array {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		String[] b = { "String", "111", "aaa" };

		//we use if else to find even and odd numbers
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(" Even Numbers : " + a[i]);
			}else {
				System.out.println(" Odd Numbers : "+a[i]);
			}
		}
System.out.println("--------------");
		// will print all odd numbers
		for (int i = 0; i < a.length; i = i + 2) {
			System.out.println("Odd Numbers : " + a[i]);
		}

		// System.out.println("how any elements we have: " +a.length);
		// System.out.println("size of array b is: "+b.length);
		//
		// System.out.println(a[3]);
		// System.out.println(b[0]);
		//
		// for(int j=0; j<a.length; j++) {
		// System.out.println(a[j]);
		// }
		//
		// for(int i=0; i<b.length; i++) {
		// System.out.println(b[i]);
		// }
	}

}







//Please everyone dont memorize anything try to understand
//why you are writing these codes and what you want to do
//if you memorize its gonna be really hard for you in the interview
