package by.cycle.main;

//���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.

import java.util.Scanner;

public class Task8 {
	public static void main(String args[]) {
		int x, x1, y;
		int ostx=0;
		int osty=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������� ������ �����");
		x=sc.nextInt();
		x1=x;
		
		System.out.println("������� ������ �����");
		y=sc.nextInt();
		
		while(x!=0) {	
			for(int i=0;i<10;i++) {
				ostx=x%10;
				osty=y%10;
					if(ostx==osty) {
						System.out.println(osty);
						break;
					}
			}
			x=x/10;
			if (x==0 &&y!=0) {
				y=y/10;
				x=x1;
				
			}
		}
	}
}
