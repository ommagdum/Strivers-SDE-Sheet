import java.util.Scanner;
public class KadaneAlgo {
	
	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		int sum = 0, max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			sum += nums[i];
			if(sum > max) {
				max = sum;
			}
			
			if(sum < 0) {
				sum = 0;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums;
		int size;
		System.out.print("Enter Size Of Array : ");
		size = sc.nextInt();
		
		nums = new int[size];
		System.out.print("Enter Elements : ");
		for(int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Maximum Subarray Sum : " + maxSubArray(nums));
		
	}
}
