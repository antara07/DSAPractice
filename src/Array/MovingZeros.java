package Array;

public class MovingZeros {
    public static void moveZeroes(int[] nums) {
        int pos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                pos = i;
                break;
            }
        }
        int index = pos + 1;
        while (index != nums.length) {
            if (nums[index] != 0) {
                nums[pos] = nums[index];
                nums[index] = 0;
                pos++;
            }
            index++;
        }
    }
}
