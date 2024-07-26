package Array;

public class MaxSubArraySum {
    public static String get(int []arr){
        int max=arr[0];
        int sum=0;
        int start=-1;
        int end=-1;
        int tempStart=-1;
        for(int i=0;i<arr.length;i++){
            if(sum==0)
                tempStart=i;
            sum+=arr[i];
            if(sum>max){
                max=sum;
                start=tempStart;
                end=i;
            }
            if(sum<0)
                sum=0;

        }
        return start+","+end;
    }
}
