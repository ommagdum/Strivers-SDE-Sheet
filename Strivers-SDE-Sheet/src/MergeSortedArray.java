import java.util.Scanner;
public class MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n - 1;

        while(m > 0 && n > 0){
            if(nums1[m - 1] > nums2[n - 1]){
                nums1[last] = nums1[m - 1];
                m--;
            }else{
                nums1[last] = nums2[n - 1];
                n--;
            }
            last--;
        }

        while (n > 0){
            nums1[last] = nums2[n-1];
            n--;
            last--;
        }
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.println("Enter m Size of Nums1 : ");
		m = sc.nextInt();
		
		int n;
		System.out.println("Enter n Size of Nums2 : ");
		n = sc.nextInt();
		
		int[] nums1 = new int[m+n];
		int[] nums2 = new int[n];
		
		System.out.println("Enter "+ m + " Elements For Nums1 : ");
		for(int i = 0; i < m+n; i++) {
			if(i < m) {
				nums1[i] = sc.nextInt();
			}else {
				nums1[i] = 0;
			}
		}
		
		System.out.println("Enter "+ n + " Elements For Nums2 : ");
		for(int i = 0; i < n; i++) {
				nums2[i] = sc.nextInt();
		}
		System.out.println("Before Transformation------");
		System.out.print("Nums1 : ");
		for(int i = 0; i < m+n; i++) {
				System.out.print(" " + nums1[i]);
		}
		System.out.println();
		
		System.out.print("Nums2 : ");
		for(int i = 0; i < n; i++) {
				System.out.print(" " + nums2[i]);
		}
		System.out.println();
		
		merge(nums1, m, nums2, n);
		
		System.out.println("After Transformation-------");
		System.out.print("Nums1 : ");
		for(int i = 0; i < m+n; i++) {
				System.out.print(" " + nums1[i]);
		}
		System.out.println();
	
		
		sc.close();
		
		
	}
}
