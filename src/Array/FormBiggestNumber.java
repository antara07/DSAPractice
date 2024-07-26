package Array;

import java.util.Arrays;
import java.util.Comparator;

public class FormBiggestNumber {
    public static String create(String[] arr){
        Comparator<String> myComparator = (X,Y)-> (X+Y).compareTo(Y+X);
        Arrays.sort(arr, myComparator.reversed());
        //Stream.of(arr).forEach(System.out::println);
        String result="";
        for(int i=0;i<arr.length;i++)
            result=result+arr[i];
        return result;
    }
}
