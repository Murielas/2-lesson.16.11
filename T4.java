// Задание 4


import java.util.Scanner;
public class T4 {
    public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String k = scanner.nextLine();
		
		switch (k){
			case "a": 
				System.out.println("A");
				break;
			case "b": 
				System.out.println("B");
				break;
			case "c": 
				System.out.println("C");
				break;
			case "d": 
				System.out.println("D");
				break;
			case "e": 
				System.out.println("E");
				break;
			case "f": 
				System.out.println("F");
				break;
			default: System.out.println("Ошибка");
		}
		
	}
}