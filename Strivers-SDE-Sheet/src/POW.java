import java.util.Scanner;

public class POW {
	 public static double myPow(double x, int n) {
	        double ans = 1.0;
	        long nn = n;
	        if(nn < 0) nn = -1 * nn;
	        while(nn > 0){
	            if(nn % 2 == 1){
	                ans = ans * x;
	                nn = nn - 1;
	            }else{
	                x = x * x;
	                nn = nn/2;
	            }
	        }
	        if(n < 0) ans = (double) 1.0 / (double) (ans);
	        return ans;
	    }
	 
	 public static void main(String[] args) {
		 int x = 0;
		 int n = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Integer Then Its Power : ");
		 x = sc.nextInt();
		 n = sc.nextInt();
		 
		 System.out.println("Output : " + myPow(x,n));
		 sc.close();
	 }
}
