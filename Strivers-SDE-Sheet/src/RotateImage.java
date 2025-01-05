import java.util.Scanner;
public class RotateImage {
	public static void rotate(int[][] matrix,int n) {
		
		int temp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		int p = 0;
		int q = 0;
		
		for(int i = 0; i < n; i++) {
			p = 0;
			q = n - 1;
			while(p < q) {
				temp = matrix[i][p];
				matrix[i][p] = matrix[i][q];
				matrix[i][q] = temp;
				p++;
				q--;
			}
		}
	}
	
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Matrix : ");
		size = sc.nextInt();
		
		int[][] matrix = new int[size][size];
		System.out.println("Enter " + (size*size) + " Elements : ");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix Before Transformation : ");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		rotate(matrix, size);
		
		System.out.println("Matrix After Transformation : ");
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
