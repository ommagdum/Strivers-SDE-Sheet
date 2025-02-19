import java.util.Arrays;
import java.util.Comparator;

public class NMeeteings {

    class Data{
        int start, end;
        
        Data(int start,int end){
            this.start = start;
            this.end = end;
        }
    }
    
    public int maxMeetings(int start[], int end[]) {
        int n = start.length;
        Data[] arr = new Data[n];
        for(int i = 0; i < n; i++){
            arr[i] = new Data(start[i], end[i]);
        }
        
        Arrays.sort(arr, Comparator.comparingInt(a -> a.end));
        
        int cnt = 1;
        int freeTime = arr[0].end;
        for(int i = 0; i < n; i++){
            if(arr[i].start > freeTime){
                cnt++;
                freeTime = arr[i].end;
            }
        }
        
        return cnt;
    }
}
