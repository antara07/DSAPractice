package Array;

public class MinimumSubArrayLength {
    public static int getOptimal(int arr[], int k){
        int minLen = Integer.MAX_VALUE;
        int right=0;
        int left=0;
        int sum=arr[0];
        while(right<arr.length){
            while(sum>k && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==k)
                minLen=Math.min(minLen,right-left+1);
            right++;
            if(right<arr.length)
                sum+=arr[right];
        }
        return minLen;
    }
}
