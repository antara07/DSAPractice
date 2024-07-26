package String;

import java.util.HashMap;

public class FrequencyMapper {
    public static String getFrequency(String str){
        HashMap<String,Integer> count = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            count.put(String.valueOf(str.charAt(i)),count.getOrDefault(String.valueOf(str.charAt(i)),0)+1);
        }
        StringBuilder result= new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(count.containsKey(String.valueOf(str.charAt(i)))){
                Integer value = count.get(String.valueOf(str.charAt(i)));
                result.append(str.charAt(i)).append(value);
                count.remove(String.valueOf(str.charAt(i)));
            }
        }
        return result.toString();
    }

    public static String getGroupedFrequency(String str){
        int count=0;
        int i=0;
        StringBuilder result = new StringBuilder();
        while(i<str.length()){
            while(i+1<str.length() && str.charAt(i+1)==str.charAt(i)){
                count++;
                i++;
            }
            result.append(str.charAt(i)).append(count + 1);
            i++;
            count=0;
        }
        return result.toString();
    }
}
