package by.lineprog.main;

//Для данной области составить линейную программу, которая печатает true,если точка с координатами
// (х, у) принадлежит закрашенной области, и false — в противном случае

public class Task6 {
	public static void main(String args[]) {
			int x  = -1;
			int y=-1;
			boolean a=true;
			boolean b=false;
			if (x<=2 && x>=-2 && y<=4) {
				System.out.println(a);	
			}
			else if (x<=4 && x>=-4 && y>=3) {
				System.out.println(a);	
			}
			else {
				System.out.println(b);	
			}
				
			
	}

}
