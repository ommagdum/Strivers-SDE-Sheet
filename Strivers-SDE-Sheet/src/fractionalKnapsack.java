import java.util.ArrayList;
import java.util.List;

class Item{
    int val;
    int wt;
    double ratio;
    
    Item(int val, int wt){
        this.val = val;
        this.wt = wt;
        this.ratio = (double) this.val / this.wt;
    }
}

// User function Template for Java
class Solution1 {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        
        List<Item> items = new ArrayList<>();
        
        for(int i = 0; i < val.size(); i++){
            items.add(new Item(val.get(i), wt.get(i)));
        }
        
        items.sort((a,b) -> Double.compare(b.ratio, a.ratio));
        
        int currWeight = 0;
        double maxValue = 0;
        
        for(int i = 0; i < val.size(); i++){
            
            if(currWeight + items.get(i).wt <= capacity){
                currWeight += items.get(i).wt;
                maxValue += items.get(i).val;
            }else{
                int remain = capacity - currWeight;
                maxValue += ((double) items.get(i).val / (double) items.get(i).wt) * (double) remain;
                break;
            }
        
        }
        
        return maxValue;
    }
}
public class fractionalKnapsack {

}
