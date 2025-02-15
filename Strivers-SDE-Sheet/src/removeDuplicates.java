
public class removeDuplicates {
	public int removeDuplicates(int[] nums) {
        int left = 1;
        int right = 1;
        
        for(right = 1; right < nums.length; right++){
            if(nums[right] != nums[right - 1]){
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }
}
