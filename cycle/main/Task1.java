package by.cycle.main;

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x;
		int sum=0;
		System.out.println("Введите целое положителное число");
		x=sc.nextInt();
		
		for(int i=1;i<x;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
