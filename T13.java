// Задание 13

import java.util.Scanner;
public class T13 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите a:");
		double x = scanner.nextDouble();
		System.out.println("Введите n:");
		int n = scanner.nextInt();
		
		double a = 1;
		for ( int i = 0; i < n; i++ ) {
			a = a * x;
		}
		
		double b = 1;
		double v = 0;
		for ( int i = 0; i < n; i++ ) {
			b = b * ( x + i );
			System.out.println(b);
			v = v + (1 / b);
		}
		
		System.out.println("а) " + a);
		System.out.println("б) " + b);
		System.out.println("в) " + v);
	}
}
		
		
		