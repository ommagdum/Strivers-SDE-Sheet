import java.util.Arrays;
import java.util.Scanner;
public class NextPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter Size Of Array : ");
		size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		nextPermutation(arr);
		System.out.println("Next Permutaion : " + Arrays.toString(arr));
	}
	
	public static void nextPermutation(int[] nums) {
        int i = nums.length-1;
        while(i >= 1 && nums[i] <= nums[i-1]) {
            i--;
        }
        if(i >= 1) {
            int j = nums.length-1;
            while(nums[j] <= nums[i-1]) {
                j--;
            }
            swap(nums, j, i-1);
        }
        reverse(nums, i, nums.length-1);
    }

	public static void swap(int[] nums, int a, int b) {
        int val = nums[a];
        nums[a] = nums[b];
        nums[b] = val;
    }

	public static void reverse(int[] nums, int a, int b) {
        int i = a;
        int j = b;
        while(i <= j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
