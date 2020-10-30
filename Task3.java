package by.lineprog.main;

//((𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦))∗𝑡𝑔 𝑥𝑦

public class Task3 {
	public static void main (String args[]) {
		double x=0.5;
		double y=1;
		double f;
		f=((Math.sin(x)+ Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
		System.out.println(f);
	}
}
