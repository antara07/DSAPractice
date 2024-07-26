package String;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public static Character get(String str){
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        Character result=null;
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            if(!frequencyMap.containsKey(curr))
                frequencyMap.put(curr,1);
            else
                frequencyMap.put(curr,frequencyMap.get(curr)+1);
        }
        //System.out.println(frequencyMap);
        for(int i=0;i<str.length();i++){
            if(frequencyMap.get(str.charAt(i))==1){
                result=str.charAt(i);
                break;
            }
        }

        return result;
    }
}
