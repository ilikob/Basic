package by.branches01.main;

//���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("������� ������ ����");
		a=sc.nextInt();
		
		System.out.println("������� ������ ����");
		b=sc.nextInt();
		 
		if ((a+b)<180) {
			if(a==90 || b==90 ) {
				System.out.println("���� ����������� �������������");
			}
			else {
				System.out.println("���� ����������� �� �������������");
			}
		}
		else {
			System.out.println("������ ������������ �� ����������");
		}
	}
}
