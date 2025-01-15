import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	
	public static int[] twoSum(int[] nums , int target) {
		Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int more = target - num;
            if(map.containsKey(more)){
                return new int[] {map.get(more), i};
            }
            map.put(num, i);
        }
        return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		int[] res = twoSum(nums, target);
		System.out.print(res[0] + " " + res[1]);
		

	}

}
