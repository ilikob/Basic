package by.cycle.main;

//���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���: 1/2^n+1/3^n

public class Task5 {
	public static void main (String args[]) {
		double e=2;
		double a=0;
		double sum=0;
		for(double i=0;i<2;i++) {
			a =(1/(Math.pow(2, i)))+(1/(Math.pow(3,i)));
			if(Math.abs(a)>=e) {
				sum+=a;
			}
		}
		System.out.println(sum);
	}
}
