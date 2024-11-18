// Задание 8

import java.util.Scanner;
public class T8 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину последовательности:");
		int length = scanner.nextInt();
		int[] array = new int[length];
		
		System.out.println("Введите элементы последовательности:");
		for ( int e = 0; e < length; e++) {
			array[e] = scanner.nextInt();
		}
		
		for ( int e = 1; e+1 < length; e++) {
		if ( (array[e] > array[e+1]) && (array[e] > array[e-1]) && (array[e]%2==0) ) {
			System.out.println("Чётный по значению локальный максимум: " + array[e]);
			}
		}
		
	}
}
			