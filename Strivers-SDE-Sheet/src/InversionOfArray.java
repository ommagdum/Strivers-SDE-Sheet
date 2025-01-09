import java.util.ArrayList;
import java.util.Scanner;

public class InversionOfArray {
	private static int merge(long[] arr, int low, int mid, int high) {
        ArrayList<Long> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        int count = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                count += (mid - left + 1); // Count inversions
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        return count;
    }

    private static int mergeSort(long[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    public static long getInversions(long[] arr, int n) {
        return mergeSort(arr, 0, n - 1);
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Size Of Array : ");
    	int size = sc.nextInt();
    	
    	long[] arr = new long[size];
    	
    	System.out.println("Enter "+size+ " Elements : ");
    	for(int i = 0; i < size; i++) {
    		arr[i] = sc.nextLong();
    	}
    	
    	System.out.println("Number Of Inversions : " + getInversions(arr, size));
    	sc.close();
    }
}
