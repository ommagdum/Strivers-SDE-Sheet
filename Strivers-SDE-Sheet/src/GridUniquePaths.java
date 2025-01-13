import java.util.Scanner;

public class GridUniquePaths {
	
	public static int uniquePaths(int m, int n) {
        int N = n + m - 2;
        int r = m - 1;
        double res = 1;
        for(int i = 1; i <=r ; i++){
            res = res * (N - r+i)/i;
        }

        return (int)res;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.println("Enter Number Of Columns :");
		m = sc.nextInt();
		
		System.out.println("Enter Number Of Rows :");
		n = sc.nextInt();
		
		System.out.println("Number Of Unique Paths : " + uniquePaths(m,n));
		
		sc.close();
	}

}
