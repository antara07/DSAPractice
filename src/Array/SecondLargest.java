package Array;

public class SecondLargest {
    public static int get(Integer []arr){
        int result = Integer.MIN_VALUE;
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                result=max;  ///largest becomes 2nd largest
                max=arr[i];  /// new largest
            }else{
                if(arr[i]>result && arr[i]!=max)
                    result=arr[i]; ///for else cases check if current is greater than 2nd largest and not max
            }
        }
        return result;
    }
}
