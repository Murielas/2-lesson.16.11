// Задание 7

import java.util.Scanner;
public class T7 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целые числа a и b и действительное число z:");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double z = scanner.nextDouble();
		double x = a % b;
		if ( x == 0 ) {
			System.out.println(z*x);
		} else {
			System.out.println(z/x);
		}
	}
}