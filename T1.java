// Задание 1

import java.util.Scanner;
public class T1 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число k:");
		int k = scanner.nextInt();
		switch (k) {
			case 1: 
				System.out.println("Плохо");
				break;
			case 2: 
				System.out.println("Неудовлетворительно");
				break;
			case 3: 
				System.out.println("Удовлетворительно");
				break;
			case 4: 
				System.out.println("Хорошо");
				break;
			case 5: 
				System.out.println("Отлично");
				break;
			default: 
				System.out.println("Ошибка");
		
		
	}
}