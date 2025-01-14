import java.util.ArrayList;

public class ReversePairs {
	public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid  && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }

    }
    public static int mergeSort(int[] arr, int low, int high){
        int count = 0;
        if(low >= high){
            return count;
        }
        int mid = (low+high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }

    public static int countPairs(int[] arr, int low, int mid, int high){
        int count = 0;
        int right = mid + 1;
        for(int i = low; i <= mid; i++){
            while (right <= high && (long) arr[i] > 2L * arr[right]) right++;
            count += (right - (mid + 1));
        }
        return count;
    }
    public static int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n-1);
    }
    
	public static void main(String[] args) {
		int[] a = {4, 1, 2, 3, 1};
		System.out.println("The number of reverse pair is: " + reversePairs(a));

	}

}
