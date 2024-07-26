package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String find(int n, String arr[]) {
        Arrays.sort(arr);
        String result = "";
        for (int i = 0; i < arr[0].length(); i++) {
            if (arr[0].charAt(i) == arr[n - 1].charAt(i)) {
                result += String.valueOf(arr[0].charAt(i));
            }else
                break;
        }
        return result;
    }
}
