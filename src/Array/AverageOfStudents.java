package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageOfStudents {
    public static double maxAverage(String [][] str){
        HashMap<String, List<Integer>> scores = new HashMap<>();
        for(int i=0; i< str.length; i++){
            List<Integer> marks = scores.getOrDefault(str[i][0], new ArrayList<>());
            marks.add(Integer.parseInt(str[i][1]));
            scores.put(str[i][0],marks);
        }
        double max = 0.0;
        for(Map.Entry<String,List<Integer>> entry : scores.entrySet()){
            double avg = entry.getValue().stream().mapToInt(e->e).average().getAsDouble();
            max = Math.max(avg,max);
            System.out.println(entry.getKey()+"->"+avg);
        }
        return max;
    }
}
