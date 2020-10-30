package by.cycle.main;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {
	public static void main(String args[]) {
		double sum=1;
		for(double i=0.005;i<=1;i+=0.005) {
			sum*=Math.pow(i, 2);
		}
		System.out.println(sum);
	}
}
