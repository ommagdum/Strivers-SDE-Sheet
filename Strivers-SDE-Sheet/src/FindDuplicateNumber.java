import java.util.Scanner;

public class FindDuplicateNumber {
	public static int duplicate(int[] nums) {
		int slow = 0;
		int fast = 0;
		while(true) {
			slow = nums[slow];
			fast = nums[nums[fast]];
			if(slow == fast) {
				break;
			}
		}
		
		int slow2 = 0;
		while(true) {
			slow = nums[slow];
			slow2 = nums[slow2];
			if(slow == slow2) {
				break;
			}
		}
		
		return slow;
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
		
		System.out.println("Duplicate Element : " + duplicate(nums));
		
	}
}
