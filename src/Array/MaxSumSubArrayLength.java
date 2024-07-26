package Array;

import java.util.HashMap;

public class MaxSumSubArrayLength {
    public static int getBetterSol(int A[], int N, int K){
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        int sum=0;
        int maxLength = 0;
        for(int i=0; i<N; i++){
            sum+=A[i];
            if(sum == K){
                maxLength= Math.max(maxLength,i+1);
            }
            int remain = sum-K;
            if(indexMap.containsKey(remain)){
                maxLength=Math.max(maxLength, i-indexMap.get(remain));
            }
            if(!indexMap.containsKey(sum)){
                indexMap.put(sum,i);
            }
        }
        return maxLength;
    }

    public static int getOptimalSol(int A[], int N, int K){
        int right = 0;
        int left = 0;
        int maxLen = 0;
        int sum =A[0];
        while(right<N){
            while(sum>K && left<=right){
                sum=sum-A[left];
                left++;
            }
            if(sum==K){
                maxLen=Math.max(maxLen,right-left+1);
            }

            right++;
            if(right<N)
                sum=sum+A[right];
        }
        return maxLen;
    }
}
