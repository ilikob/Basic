package by.branches01.main;

//������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ ����� ���������.

public class Task4 {
	public static void main(String args[]) {
		int A=10;
		int B=15;
		int x=3;
		int y=5;
		int z=19;
		if(y<=z && y<=x && A<B) {
			if(y<A) {
				if(x<=z && x<B) {
					System.out.println("������");
				}
				else if(z<x && z<B) {
					System.out.println(" ������");
				}
				else {
					System.out.println(" �� ������");
				}
			}
			else {
				System.out.println("�� ������");
			}
		}
		
		else if(y<=z && y<=x && B<A) {
			if(y<B) {
				if(x<=z && x<A) {
					System.out.println("������");
				}
				else if(z<x && z<A) {
					System.out.println(" ������");
				}
				else {
					System.out.println(" �� ������");
				}
			}
			else {
				System.out.println("�� ������");
			}
		}
		
		else if(x<=y && x<=z && B<A) {
			if(x<B) {
				if(y<=z && y<A) {
					System.out.println("������");
				}
				else if(z<y && z<A) {
					System.out.println(" ������");
				}
				else {
					System.out.println(" �� ������");
				}
			}
			else {
				System.out.println("�� ������");
			}
		}
		
		else if(x<=y && x<=z && A<B) {
			if(x<A) {
				if(y<=z && y<B) {
					System.out.println("������");
				}
				else if(z<y && z<B) {
					System.out.println(" ������");
				}
				else {
					System.out.println(" �� ������");
				}
			}
			else {
				System.out.println("�� ������");
			}
		}
		
		else if(z<=y && z<=x && A<B) {
			if(z<A) {
				if(y<=x && y<B) {
					System.out.println("������");
				}
				else if(x<y && z<B) {
					System.out.println(" ������");
				}
				else {
					System.out.println(" �� ������");
				}
			}
			else {
				System.out.println("�� ������");
			}
		}
		
		else if(z<=y && z<=x && B<A) {
			if(z<B) {
				if(y<=x && y<A) {
					System.out.println("������");
				}
				else if(x<y && z<A) {
					System.out.println(" ������");
				}
				else {
					System.out.println(" �� ������");
				}
			}
			else {
				System.out.println("�� ������");
			}
		}
		
		else {
			System.out.println("�� ������");
		}
	}
}
