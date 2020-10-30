package by.branches01.main;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

import java.util.Scanner;

public class Task3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		int x1, x2, x3, y1, y2, y3;
		
		System.out.println("Введите x1");
		x1=sc.nextInt();
		
		System.out.println("Введите x2");
		x2=sc.nextInt();
		
		System.out.println("Введите x3");
		x3=sc.nextInt();
		
		System.out.println("Введите y1");
		y1=sc.nextInt();
		
		System.out.println("Введите y2");
		y2=sc.nextInt();

		System.out.println("Введите y3");
		y3=sc.nextInt();
		
		if(x1==x2 && x1==x3) {
			System.out.println("Эти точки расположены на одной прямой");
		}
		else if(y1==y2 && y1==y3) {
			System.out.println("Эти точки расположены на одной прямой");
		}
		else {
			System.out.println("Эти точки не расположены на одной прямой");
		}
	}

}
