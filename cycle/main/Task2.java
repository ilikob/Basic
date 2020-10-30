package by.cycle.main;

//Вычислить значения функции на отрезке [а,b] c шагом h: x,x>2  x, x<=2

public class Task2 {
	public static void main(String args[]) {
		double a=1;
		double b=4;
		double h=0.5;
		double y=0;
		for(double i=1; i<=b;i+=h) {
			double x=i;
			if(x>2) {
				y=x;
			}
			else if(x<=2) {
				y=-x;
			}
			System.out.println("y=" + y);
		}
	}
}
