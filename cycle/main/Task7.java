package by.cycle.main;

//��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����. 

import java.util.Scanner;

public class Task7 {
	public static void main (String args[]) {
		int m, n;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("������� m");
		m=sc.nextInt();
		
		System.out.println("������� n");
		n=sc.nextInt();
		
		for(int i=m;i<=n;i++) {
			for(int j=2;j<i;j++) {
				if (i%j==0 && i!=j) {
					System.out.println("�����: "+i+"   ��������: "+j);
				}
			}
		}
		
	}
}
