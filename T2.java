// Задание 2

import java.util.Scanner;
public class T2 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ваш час:");
		int k = scanner.nextInt();
		switch (k) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Доброй ночи");
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("Доброе утро");
				break;
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
				System.out.println("Добрый день");
				break;
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
				System.out.println("Добрый вечер");
			case 23:
				System.out.println("Доброй ночи");
				break;
			
			
		}
		
	}
}