package by.branches01.main;

//���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		int x1, x2, x3, y1, y2, y3;
		
		System.out.println("������� x1");
		x1=sc.nextInt();
		
		System.out.println("������� x2");
		x2=sc.nextInt();
		
		System.out.println("������� x3");
		x3=sc.nextInt();
		
		System.out.println("������� y1");
		y1=sc.nextInt();
		
		System.out.println("������� y2");
		y2=sc.nextInt();

		System.out.println("������� y3");
		y3=sc.nextInt();
		
		if(x1==x2 && x1==x3) {
			System.out.println("��� ����� ����������� �� ����� ������");
		}
		else if(y1==y2 && y1==y3) {
			System.out.println("��� ����� ����������� �� ����� ������");
		}
		else {
			System.out.println("��� ����� �� ����������� �� ����� ������");
		}
	}

}
