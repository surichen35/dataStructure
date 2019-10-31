package Datastructer.Review;
public class Recursion {
	public static int getFactorial(int n) {
		if(n>=0) {
			if(n==0) {
				return 1;
			}
		else {
				int temp = n*getFactorial(n-1);
				return temp;
			}	
		}
		return -1;
	}
	public static void main(String[] args) {
		int factorial = getFactorial(-4);
		System.out.println(factorial);
	}
}
