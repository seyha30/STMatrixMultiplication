import java.util.Scanner;

public class SingleThread {

	public static void main(String[] args) {
		createMenu();
	}

	private static void createMenu() {
		Matrix matrix = new Matrix();
		boolean loopBreaker = true;
		int option;
		while (loopBreaker) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter menu :");
			System.out.println("1 : Create Matrix");
			System.out.println("2 : Auto Generate Matrix");
			System.out.println("3 : Multiply Matrix");
			System.out.println("4 : Exit");
			option = (int) scanner.nextInt();
			switch (option) {
			case 1:
				matrix.createMatrix(option);
				break;
			case 2:
				matrix.createMatrix(option);
				break;
			case 3:
				matrix.multiply();
				break;
			case 4:
				loopBreaker = false;
				break;

			default:
				System.out.println("Incorrect input");
				loopBreaker = false;
				break;
			}

		}

	}

}
