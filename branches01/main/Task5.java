package by.branches01.main;

//x^3-3x-9  x<=3
//1/(x^3 +6 ) x>3

public class Task5 {
	
	public static void main(String args[]) {
		double x=2;
		if(x<=3) {
			x=Math.pow(x,2)+x*3-9;
			System.out.println(x);
		}
		else if(x>3) {
			x=1/(Math.pow(x,3)+6);
			System.out.println(x);
		}
	}
}