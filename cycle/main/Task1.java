package by.cycle.main;

//�������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x;
		int sum=0;
		System.out.println("������� ����� ������������ �����");
		x=sc.nextInt();
		
		for(int i=1;i<x;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
