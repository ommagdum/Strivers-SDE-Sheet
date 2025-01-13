
public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }

        return element;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,1,2,2};
		System.out.print("Majority Element : "+ majorityElement(nums));
	}

}
