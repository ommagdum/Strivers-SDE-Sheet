import java.util.Scanner;
public class StockBuySell {
	
	public static int maxProfit(int[] prices,int days) {
		int min = prices[0];
		int profit = 0;
		int cost = 0;
		
		for(int i = 1; i < days; i++) {
			cost = prices[i] - min;
			profit = Math.max(profit, cost);
			min = Math.min(min, prices[i]);
		}
		
		return profit;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days : ");
		int days = sc.nextInt();
		
		int[] prices = new int[days];
		System.out.print("Enter price of stock for each day : ");
		for(int i = 0; i < days; i++) {
			prices[i] = sc.nextInt();
		}
		
		System.out.println("Maximum Profit : " + maxProfit(prices, days));
		sc.close();
	}
}
