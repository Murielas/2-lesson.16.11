// Задание 5

import java.util.Scanner;
public class T5 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ВВедите номер месяца:");
		int k = scanner.nextInt();
		System.out.println("Осталось месяцев: "+ (12-k));
	}
}