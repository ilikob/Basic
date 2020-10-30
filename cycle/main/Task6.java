package by.cycle.main;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {
	public static void main (String args[]) {
		System.out.println("ASCII символы и коды:");
		System.out.println("№ символ 8  16");
        for (int i = 33; i < 256; i++) {
            char ch = (char) i;
            String temp8 = Integer.toOctalString(i);
            String temp16 = Integer.toHexString(i);
            System.out.printf("%03d %3s %5s %4s%n", i, ch, temp8, temp16);
        }
	}
}

