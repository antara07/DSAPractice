package Array;

public class MissingNumber {
    public static int find(int []n){
        int sum = ((n.length)*(n.length+1))/2;
        int total=0;
        for(int i=0; i<n.length; i++){
            total+=n[i];
        }

        return sum-total;
    }
}
