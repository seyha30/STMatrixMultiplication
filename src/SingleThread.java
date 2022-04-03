import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SingleThread {

	public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
//
//        ArrayList<Integer> row1 = new ArrayList<Integer>(Arrays.asList(1,2,3));
//        ArrayList<Integer> row2 = new ArrayList<Integer>(Arrays.asList(4,5,6));
//        ArrayList<Integer> row3 = new ArrayList<Integer>(Arrays.asList(7,8,9));
//        matrix.add(row1);
//        matrix.add(row2);
//        matrix.add(row3);
//        System.out.println(matrix.toString());
		createMenu();

//		int[][] twodArray = new int[3][2]; // declared and created array object
//		Scanner s1 = new Scanner(System.in); //created Scanner object
//		System.out.println("Please enter the values to be added");
//		for(int i = 0 ; i < 3 ; i++){
//		for(int j = 0 ; j < 2; j++)
//		{
//		System.out.println("row => " + i + " col = > " + j );
//		twodArray[i][j] = s1.nextInt();
//		}
//		System.out.println();
//		}
//		System.out.println("Your output would be as below:");
//		for(int i = 0 ; i < 3 ; i++){
//		for(int j = 0 ; j < 2; j++)
//		{
//		System.out.print(twodArray[i][j] + " " );
//		}
//		System.out.println();
//		}

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
