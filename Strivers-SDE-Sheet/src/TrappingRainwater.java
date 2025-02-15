
public class TrappingRainwater {
	public int trap(int[] height) {
        if(height == null){
            return 0;
        }

        int left = 0;
        int right = height.length;
        int leftMax = height[left];
        int rightMax = height[right-1];
        int res = 0;

        while(left < right){
            if(leftMax < rightMax){
                left += 1;
                leftMax = Math.max(leftMax, height[left]);
                res += leftMax - height[left];
            }else{
                right -= 1;
                rightMax = Math.max(rightMax, height[right]);
                res += rightMax - height[right];
            }
        }

        return res;
    }
}
