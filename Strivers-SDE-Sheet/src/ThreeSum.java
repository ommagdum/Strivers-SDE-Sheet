import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if((i > 0) && nums[i] == nums[i-1]){
                continue;
            }

            int left = i + 1;
            int right = n - 1;
            while(left < right){
                int threeSum = nums[i] + nums[left] + nums[right];
                if(threeSum > 0){
                    right -= 1;
                }
                else if(threeSum < 0){
                    left += 1;
                }else{
                    List<Integer> ans = Arrays.asList(nums[i],nums[left],nums[right]);
                    res.add(ans);
                    left += 1;
                    while((nums[left] == nums[left - 1]) && left < right){
                        left += 1;
                    }
                }
            }
        }

        return res;
    }
}
