// Задание 14

import java.util.Scanner;
public class T14 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину n:");
		int n = scanner.nextInt();
		
		System.out.println("Введите i<=n:");
		int i = scanner.nextInt();
		
		double[] arr = new double[n];
		
		System.out.println("Введите элементы массива:");
        for (int j = 0; j < n; j++){
            arr[j] = scanner.nextDouble();
        }
		
		double sum = 0;
		for (int j = 0; j < n; j++){
			sum = sum + arr[j];
		}
	
		double y = (sum - arr[i])/(n-1);
		System.out.println("Среднее арифметическое: " + y);
	}
}