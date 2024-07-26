package String;

public class ReorganiseString {
    public static String apply(String s){
        int [] frequency = new int[26];
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
        }
        int max =0;
        int value = 0;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i]>max){
                max=frequency[i];
                value=i;
            }
        }
        if(max>(s.length()+1)/2){
            return "";
        }
        char [] arr = new char[s.length()];
        int i=0;
        while(frequency[value]!=0){
            arr[i]=(char)(value+'a');
            i+=2;
            frequency[value]--;
        }
        for(int j=0;j<frequency.length;j++){
            while(frequency[j]!=0){
                if(i>=arr.length)
                    i=1;
                arr[i]=(char)(j+'a');
                i+=2;
                frequency[j]--;
            }
        }
        return String.valueOf(arr);
    }
}
