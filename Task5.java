package by.lineprog.main;

//������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:��� ����� SSc.

public class Task5 {
	public static void main(String args[]) {
		int T=4550;
		int s, m, M, h;
		s=T%60;
		M=(T-s)/60;
		m=M%60;
		h=(M-m)/60;
		System.out.println(h+"� "+ m +"� "+ s +"�");
	}
}
