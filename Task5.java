package by.lineprog.main;

//¬ывести данное значение длительности в часах, минутах и секундах в следующей форме:ЌЌч ћћмин SSc.

public class Task5 {
	public static void main(String args[]) {
		int T=4550;
		int s, m, M, h;
		s=T%60;
		M=(T-s)/60;
		m=M%60;
		h=(M-m)/60;
		System.out.println(h+"ч "+ m +"м "+ s +"с");
	}
}
