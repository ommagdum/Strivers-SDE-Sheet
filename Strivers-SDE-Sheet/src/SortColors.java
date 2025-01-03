import java.util.Scanner;
public class SortColors {
	
	public static void SortColors012(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;
		
		while(mid <= high) {
			if(nums[mid] == 0) {
				swap(nums, low, mid);
				mid++;
				low++;
			}else if(nums[mid] == 1){
				mid++;
			}else {
				swap(nums, mid, high);
				high--;
			}
		}
	}
	
	public static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter Size Of Array : ");
		size = sc.nextInt();
		int[] nums = new int[size];
		
		System.out.print("Enter Elements (0's , 1's or 2's in any order): ");
		for(int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Array Before Sorting :");
		for(int i = 0; i < size; i++) {
			System.out.print(" "+nums[i]);
		}
		System.out.println();
		SortColors012(nums);
		System.out.println("Array After Sorting :");
		for(int i = 0; i < size; i++) {
			System.out.print(" "+nums[i]);
		}
	}
}
