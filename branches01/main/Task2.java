package by.branches01.main;

//max{min (a, b) min (c, d)}

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		int a, b, c, d;
		Scanner sc =new Scanner(System.in) ;
		
		System.out.println("¬ведите a");
		a=sc.nextInt();
		
		System.out.println("¬ведите b");
		b=sc.nextInt();
		
		System.out.println("¬ведите c");
		c=sc.nextInt();
		
		System.out.println("¬ведите d");
		d=sc.nextInt();
		
		if(a<b) {
			if(c<d) {
				if (a>c) {
					
					System.out.println(a);
				}
				else {
					System.out.println(c);
				}
			}
			else if(d<c) {
				
				if (a>d) {
					System.out.println(a);
				}
				else {
					System.out.println(d);
				}
						
			}
			
		}
		else {
			if(c<d) {
				if (b>c) {
					
					System.out.println(b);
				}
				else {
					System.out.println(c);
				}
			}
			else if(d<c) {
				
				if (b>d) {
					System.out.println(b);
				}
				else {
					System.out.println(d);
				}
						
			}
			
		}
		
	}
}
