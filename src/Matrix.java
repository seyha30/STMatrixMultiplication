import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {

	private int row;
	private int col;
	private Random random;
	private int arr1[][];
	private int arr2[][];
	private int multiply[][];

	public void createMatrix(int option) {
		System.out.println("====> " + option);
		if (option == 1) {
			this.manualMatrix();
		}
		if (option == 2) {
			this.autoMatrix();
		}

	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void multiply() {
		multiply = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				multiply[i][j] = 0;
				for (int k = 0; k < arr2[0].length; k++) {
					multiply[i][j] += arr1[i][k] * arr2[k][j];
				} 
			}
		}
		this.display();
	}

	public void display() {
		System.out.println("display Matrix" + Arrays.deepToString(multiply));
	}

	protected int getRandomNumber() {
		random = new Random();
		return random.nextInt(3) + 1;
	}

	protected void autoMatrix() {
		setMatrixSize();
		arr2 = new int[this.getRow()][this.getCol()];
		for (int i = 0; i < this.getRow(); i++) {
			for (int j = 0; j < this.getCol(); j++) {
				arr2[i][j] = getRandomNumber();
			}
		}
		System.out.println(Arrays.toString(this.arr2));

	}

	protected void manualMatrix() {
		setMatrixSize();
		Scanner s1 = new Scanner(System.in);
		arr1 = new int[this.getRow()][this.getCol()];
		for (int i = 0; i < this.getRow(); i++) {
			for (int j = 0; j < this.getCol(); j++) {
				System.out.println("row => " + i + " col = > " + j);
				arr1[i][j] = s1.nextInt();

			}
		}

	}

	protected void setMatrixSize() {
		System.out.println("Enter row num:");
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		setRow(r);
		System.out.println("Enter col num");
		int c = scanner.nextInt();
		setCol(c);
		
	}


	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}


}
