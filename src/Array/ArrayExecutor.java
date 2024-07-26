package Array;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

public class ArrayExecutor {
    public static void main(String args[]){
//        int secondLargest = SecondLargest.get(new Integer[]{10,5,10});
//        System.out.println("Second Largest : "+secondLargest);

//        String formBiggestNum = FormBiggestNumber.create(new String[]{"54", "546", "548", "60"});
//        System.out.println(formBiggestNum);

//        int maxSubArrayLen = MaxSumSubArrayLength.getBetterSol(new int[]{10, 5, 2, 7, 1, 9}, 6, 15);
//        System.out.println("Maximum SubArray Length : "+ maxSubArrayLen);

//        int maxSubArrayLen = MinimumSubArrayLength.getOptimal(new int[]{4,2, 3, 1, 5, 6}, 6);
//        System.out.println("Minimum SubArray Length : "+ maxSubArrayLen);

//        double median = MedianOf2Arrays.get(new int[]{1,2}, new int[]{3,4});
//        System.out.println("Median : "+median);

//          System.out.println("Braces are Balanced ? "+BalanceBraces.check("[()]{}{[()()]()}"));
//          System.out.println("Braces are Balanced ? "+BalanceBraces.check("[(])"));

//        System.out.println("Missing Number : "+ MissingNumber.find(new int[]{1,2,0,4,5}));

//        double maxAvg = AverageOfStudents.maxAverage(new String [][]{{"Charles","65"},{"David","100"},{"John","70"},{"Charles","61"}});
//        System.out.println(maxAvg);

//        int []arr = new int[]{0,1,0,3,12};
//        MovingZeros.moveZeroes(arr);
//        Arrays.stream(arr).forEach(System.out::print);

        int []result = TwoSum.twoSum(new int[]{3,2,4}, 6);
        System.out.println(result[0]+","+result[1]);
    }
}
