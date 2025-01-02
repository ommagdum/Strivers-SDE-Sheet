import java.util.Scanner;
public class SetMatrixZero {
	public static void setZeroes(int[][] matrix) {
		int rows = matrix.length;
		int columns = matrix[0].length;
		int col0 = 1;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(matrix[i][j]==0) {
					matrix[i][0] = 0;
					if(j != 0) {
						matrix[0][j] = 0;
					}else {
						col0 = 0;
					}
				}
			}
		}
		
		for(int i = 1; i < rows; i++) {
			for(int j = 1; j < columns; j++) {
				if(matrix[i][j] != 0) {
					if(matrix[0][j] == 0 || matrix[i][0] == 0) {
						matrix[i][j] = 0;
					}
				}
			}
		}
		
		if(matrix[0][0] == 0){
			for(int j = 0; j < columns; j++) matrix[0][j] = 0;
		}
		
		if(col0 == 0) {
			for(int i = 0; i < rows; i++) {
				matrix[i][0] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number Of Rows : ");
		int rows = sc.nextInt();
		
		System.out.print("Enter Number Of Columns : ");
		int cols = sc.nextInt();
		
		int[][] matrix = new int[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Entered Matrix : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
		
		setZeroes(matrix);
		System.out.println("Matrix After Transformation : ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
