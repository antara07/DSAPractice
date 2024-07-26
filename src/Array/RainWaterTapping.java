package Array;

public class RainWaterTapping {
    public static int calculate(int []height){
        int [] left = new int[height.length];
        int [] right = new int[height.length];

        int max=0;
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            left[i]=max;
        }
        max=0;
        for(int i=height.length-1; i>=0; i--){
            max=Math.max(max,height[i]);
            right[i]=max;
        }
        int sum=0;
        for(int i=0;i<height.length; i++){
            sum= sum + (Math.min(left[i],right[i])-height[i]);
        }
        return sum;
    }
}
