// Задание 11

import java.util.Scanner;
public class T11 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину n: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		int proiz = 1;
		
		System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
		
		for ( int i = 0; i < n; i++) {
			if ( arr[i] % 7 == 0 ) {
				proiz = proiz * arr[i];
			}
		}
		
		System.out.println("Произведение элементов кратных семи: " + proiz);
	}
}