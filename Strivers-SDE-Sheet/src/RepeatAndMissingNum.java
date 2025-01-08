import java.util.Scanner;

public class RepeatAndMissingNum {
	public static int[] repeatedNumber(final int[] A) {
        long n = A.length;
        
        long SN = (n * (n + 1))/2;
        long S2N = (n * (n+1) * (2 * n + 1))/6;
        long S = 0;
        long S2 = 0;
        for(int i = 0; i < n; i++){
            S += A[i];
            S2 += (long) A[i] * (long) A[i];
        }
        
        long val1 = S-SN;
        long val2 = S2 - S2N;
        val2 = val2/val1;
        long x = (val1 + val2)/2;
        long y = x - val1;
        
        return new int[] {(int) x, (int)y};
    }
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int n = 0;
		System.out.println("Enter Size Of Array : ");
		n = sc.nextInt();
		
		int[] nums = new int[n+1];
		
		System.out.println("Enter " +n+ " Elements Ranging From 1 - " +(n - 1)+ " Repeatation Is Allowed : " );
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		
		int[] res = repeatedNumber(nums);
		System.out.println("Duplicate & Missing Element : ");
		for(int i = 0; i < 2; i++) {
			System.out.print(" "+res[i]);
		}
	}
}
