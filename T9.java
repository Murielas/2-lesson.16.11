// Задание 9

import java.util.Scanner;
public class T9 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину n: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		int kol = 0;
		int sum = 0;
		
		System.out.println("Введите элементы массива");
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
		
		for ( int i = 0; i < n; i++) {
			if ((arr[i] % 5 == 0) && (arr[i] % 7 != 0)) {
				kol++;
				sum = sum + arr[i];
			}
		}
		
		System.out.println("Количество элементов: "+kol);
		System.out.println("Сумма этих элементов: "+sum);
	}
}