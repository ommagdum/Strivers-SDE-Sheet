import java.util.Scanner;

public class Search2DMatrix {
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int low = 0;
	        int high = m * n - 1;

	        while(low <= high){
	            int mid = (low + high) / 2;
	            int row = mid / m;
	            int col = mid % m;
	            if(matrix[row][col] == target) return true;
	            else if(matrix[row][col] < target) low = mid + 1;
	            else high = mid - 1;
	        }
	        return false;
	    }
	 
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int m = 0;
		 int n = 0;
		 System.out.println("Enter 2 Dimensions for Matrix : ");
		 m = sc.nextInt();
		 n = sc.nextInt();
		 
		 int[][] matrix = new int[m][n];
		 
		 System.out.println("Enter " + m*n + " Elements : ");
		 for(int i = 0; i < m; i++) {
			 for(int j = 0; j < n; j++) {
				 matrix[i][j] = sc.nextInt();
			 }
		 }
		 
		 int target = 0;
		 System.out.println("Enter Target Number : ");
		 target = sc.nextInt();
		 
		 if(searchMatrix(matrix, target)) {
			 System.out.println("Element Found.");
		 }else {
			 System.out.println("Element Not Found.");
		 }
		 
		 sc.close();
	 }
}
