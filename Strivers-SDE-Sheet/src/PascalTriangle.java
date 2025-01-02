import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PascalTriangle {
	
	public static void main(String[] args){
		int numRows;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number Of Rows : ");
		numRows = sc.nextInt();
		sc.close();
		
		List<List<Integer>> ans = new ArrayList<>();
		for(int i = 1; i <= numRows; i++) {
			int res = 1;
			List<Integer> ansRow = new ArrayList<>();
			ansRow.add(1);
			for(int col = 1; col < i; col++) {
				res = res * (i - col);
				res = res / col;
				ansRow.add(res);
			}
			ans.add(ansRow);
		}
		System.out.println("Pascal Triangle : ");
		System.out.print(ans);
		
	}
}
