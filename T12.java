// Задание 12

import java.util.Scanner;
public class T12 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите x:");
		double x = scanner.nextDouble();
		
		double a = 0;
		if ((-2 <= x) && ( x < 2 )) {
			a = x * x;
		} else { a = 4; }
		
		double b = 0;
		if ( x <= 2) {
			b = (x * x) + 4 * x + 5;
		} else { b = 1/(x * x + 4 * x + 5); }
		
		System.out.println("a) " + a);
		System.out.println("b) " + b);
	}
}
		