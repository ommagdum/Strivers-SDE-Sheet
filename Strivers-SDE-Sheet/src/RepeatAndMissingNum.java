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
}
