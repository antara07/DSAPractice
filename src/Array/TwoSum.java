package Array;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[0]=map.get(target - nums[i]);
                result[1]=i;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
