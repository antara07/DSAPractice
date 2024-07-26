package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderOfArray {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        int max=-1;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            if(arr[i]>=max){
                max=arr[i];
                result.add(max);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
