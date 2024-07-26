package String;

public class LongestPalindromeSubstring {
    public static String get(String s){
        if(s.length()==1)
            return s;
        if(s.length()==2 && s.charAt(0)==s.charAt(1))
            return s;
        String result ="";
        int low=0;
        int high =0;
        for(int i=1; i<s.length();i++){

            //odd cases
            low=i;
            high=i;

            while(low!=-1 && high!=s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }
            String val = s.substring(low+1,high);
            if(result.length()<val.length())
                result=val;

            //even cases
            low = i-1;
            high=i;

            while(low!=-1 && high!=s.length() && s.charAt(low)==s.charAt(high)){
                low--;
                high++;
            }

            val = s.substring(low+1,high);
            if(result.length()<val.length())
                result=val;
        }
        return result;
    }
}
