package by.lineprog.main;

//ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). ѕомен€ть местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {
	public static void main(String args[]) {
		double R=111.222;
		int i=(int)R;
		double fract =R-i;
		double r=(i/1000.0)+(fract*1000);
		System.out.printf("%.3f",r);
		
	}
}
