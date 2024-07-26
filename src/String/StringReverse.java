package String;

public class StringReverse {
    public static String reverseWordOrder(String str){
        String [] arr = str.trim().split("\\s+");
        int i=0;
        int j=arr.length-1;
        String temp = "";
        while(i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return String.join(" ",arr);
    }

    public static String reverseWholeString(String str){
        int i=0;
        int j=str.length()-1;
        String [] arr = str.split("");
        String temp = "";
        while(i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return String.join("",arr);
    }

    public static String reverseEachString(String str){
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            String [] words = arr[i].split("");
            int j=0;
            int k=words.length-1;
            String temp = "";
            while(j<k){
                temp=words[k];
                words[k]=words[j];
                words[j]=temp;
                j++;
                k--;
            }
            arr[i]=String.join("",words);
        }
        return String.join(" ",arr);
    }
}
