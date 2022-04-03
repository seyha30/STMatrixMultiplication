import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Matrix {

	private int row;
	private int col;
	private Random random;
	private ArrayList<Integer[][]> matrices = new ArrayList<Integer[][]>();
	private int arr1[][];
	private int arr2[][];

	public void createMatrix(int option) {
		if (option == 1) {
			this.manualMatrix();
		}
		if (option == 2) {
			this.manualMatrix();
		}

	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void multiply() {
		System.out.println("multiply Matrix");
	}

	public void display() {
		System.out.println("display Matrix");
	}

	protected int getRandomNumber() {
		random = new Random();
		return random.nextInt(3) + 1;
	}

	protected void autoMatrix() {
		setMatrixSize();
		Scanner s1 = new Scanner(System.in);
		arr2 = new int[this.getRow()][this.getCol()];
		for (int i = 0; i < this.getRow(); i++) {
			for (int j = 0; j < this.getCol(); j++) {
				arr2[i][j] = getRandomNumber();
			}
		}

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

		System.out.println(" ok o  " + arr1.toString());

	}

	public int getRandomNumber1() {
		return random.nextInt(3) + 1;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public ArrayList<Integer[][]> getMatrices() {
		return matrices;
	}

	public void setMatrices(ArrayList<Integer[][]> matrices) {
		this.matrices = matrices;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	protected void setMatrixSize() {
		System.out.println("Enter row num:");
		Scanner rowNum = new Scanner(System.in);
		int r = rowNum.nextInt();
		setRow(r);
		System.out.println("Enter col num");
		Scanner colNum = new Scanner(System.in);
		int c = colNum.nextInt();
		setCol(c);

	}

}
