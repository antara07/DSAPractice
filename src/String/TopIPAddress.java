package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopIPAddress {
    public static List<String> get(List<String> log){
        HashMap<String,Integer> frequencyMap = new HashMap<>();
        List<String> listOfIP = new ArrayList<>();
        for(String str : log){
            String IP = (str.split(" ")[0]);
            frequencyMap.put(IP, frequencyMap.getOrDefault(IP,0)+1);
        }
        int maxFrequency = 0;
        for(String key : frequencyMap.keySet()){
            maxFrequency = Math.max(maxFrequency,frequencyMap.get(key));
        }
        for(String key : frequencyMap.keySet()){
            if(frequencyMap.get(key)==maxFrequency)
                listOfIP.add(key);
        }
        return listOfIP;
    }
}
