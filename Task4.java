package by.lineprog.main;

//���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.

public class Task4 {
	public static void main(String args[]) {
		double R=111.222;
		int i=(int)R;
		double fract =R-i;
		double r=(i/1000.0)+(fract*1000);
		System.out.printf("%.3f",r);
		
	}
}
