import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencing {
	class Job{
        int id, deadline, profit;
        
        Job(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        int pmax = 0;
        int nmax = 0;
        int n = id.length;
        
        Job[] jobs = new Job[n];
        for(int i = 0; i < n; i++){
            jobs[i] = new Job(id[i], deadline[i], profit[i]);
        }
        
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        
        int maxi = 0;
        for(int i = 0; i < n; i++){
            maxi = Math.max(jobs[i].deadline, maxi);
        }
        
        int[] res = new int[maxi + 1];
        
        for(int i = 0; i < res.length; i++){
            res[i] = -1;
        }
        
        for(int i = 0; i < n; i++){
            for(int j = jobs[i].deadline; j > 0; j--){
                if(res[j] == -1){
                    res[j] = i;
                    nmax++;
                    pmax += jobs[i].profit;
                    break;
                }
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nmax);
        ans.add(pmax);
        return ans;
    }
}
