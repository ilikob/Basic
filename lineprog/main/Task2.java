package by.lineprog.main;

//((𝑏+√𝑏2+4𝑎𝑐)/2𝑎)−𝑎3𝑐+𝑏−2

public class Task2 {
	public static void main(String[] args) {
		double a=4;
		double b=2;
		double c=3;
		double f;
		
		f=((b+(Math.sqrt(Math.pow(b, 2)+4*a*c)))/(2*a)) - ((Math.pow(a, 3))*c)+(Math.pow(b, -2));
		System.out.println(f);
	}
}
