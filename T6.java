// Задание 6

import java.util.Scanner;
public class T6 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ширину:");
		int m = scanner.nextInt();
		System.out.println("Введите длину:");
		int x = scanner.nextInt();
		String res = "";
		
		for ( int h = 0; h < m; h++ ) {
			res = res + "1 ";
		}
		
		for ( int a = 0; a < x; a++) {
			System.out.println(res);
		}
			
			
	}
}