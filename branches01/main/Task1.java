package by.branches01.main;

//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		int a, b;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Введите первый угол");
		a=sc.nextInt();
		
		System.out.println("Введите второй угол");
		b=sc.nextInt();
		 
		if ((a+b)<180) {
			if(a==90 || b==90 ) {
				System.out.println("Этот треугольник прямоугольный");
			}
			else {
				System.out.println("Этот треугольник не прямоугольный");
			}
		}
		else {
			System.out.println("Такого треугольника не сушествует");
		}
	}
}
