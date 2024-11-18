// Задание 3

import java.util.Scanner;
public class T3 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ваше число:");
		int k = scanner.nextInt();
		System.out.println("Введите номер действия:");
		System.out.println("1) Возвести число в квадрат");
		System.out.println("2) Извлечь корень квадратный");
		System.out.println("3) Вычислить синус");
		System.out.println("4) Вычислить косинус");
		int u = scanner.nextInt();
		switch (u){
			case 1: 
				System.out.println(k*k);
				break;
			case 2:
				System.out.println(Math.sqrt(k));
				break;
			case 3:
				System.out.println(Math.sin(k));
				break;
			case 4:
				System.out.println(Math.cos(k));
				break;
			default: System.out.println("Ошибка");
		}
	}
}
		