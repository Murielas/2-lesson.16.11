// Задание 10

import java.util.Scanner;
public class T10 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину n: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		int sum = 0;
		
		System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
		
		for ( int i = 0; i < n; i++) {
			if ( arr[i] > 0 ) {
				sum = sum + arr[i];
			}
		}
		
		System.out.println("Удвоенная сумма положительных элементов: "+(sum*2));
	}
}