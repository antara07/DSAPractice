package String;

import java.util.*;

public class Anagrams {
    public static Collection<Set<String>> find(String []str){
        HashMap<String, Set<String>> anagrams = new HashMap<>();
        for(String val : str){
            char[] charArray = val.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = String.valueOf(charArray);
            Set<String> values =  anagrams.getOrDefault(sortedWord, new TreeSet<>());
            values.add(val);
            anagrams.put(sortedWord,values);
        }
        //System.out.println(anagrams);
        return anagrams.values();
    }
}
