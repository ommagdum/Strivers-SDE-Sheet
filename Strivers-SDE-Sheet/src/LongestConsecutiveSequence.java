import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	
	public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }

        for(int it : set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x = x + 1;
                    cnt = cnt + 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

	public static void main(String[] args) {
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		System.out.println("Longest Consecutive Sequence : " + longestConsecutive(nums));
	}

}
