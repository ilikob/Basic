package by.cycle.main;

//ƒл€ каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 

import java.util.Scanner;

public class Task7 {
	public static void main (String args[]) {
		int m, n;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("¬ведите m");
		m=sc.nextInt();
		
		System.out.println("¬ведите n");
		n=sc.nextInt();
		
		for(int i=m;i<=n;i++) {
			for(int j=2;j<i;j++) {
				if (i%j==0 && i!=j) {
					System.out.println("„исло: "+i+"   ƒелитель: "+j);
				}
			}
		}
		
	}
}
