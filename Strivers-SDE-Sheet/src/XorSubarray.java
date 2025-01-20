import java.util.HashMap;
import java.util.Map;

public class XorSubarray {
	
	public static int solve(int[] A, int B) {
        int k = B;
        int n = A.length;
        int xr = 0;
        Map<Integer,Integer> mpp = new HashMap<>();
        mpp.put(xr, 1);
        int cnt = 0;
        
        for(int i = 0; i < n; i++){
            xr = xr ^ A[i];
            int x = xr ^ k;
            if(mpp.containsKey(x))
            {
                cnt += mpp.get(x);
            }
            
            if(mpp.containsKey(xr))
            {
                mpp.put(xr, mpp.get(xr) + 1);
            }else{
                mpp.put(xr, 1);
            }
        }
        
        return cnt;
    }

	public static void main(String[] args) {
		int[]  A = {4, 2, 2, 6, 4};
		int B = 6;
		
		System.out.println(solve(A,B));

	}

}
