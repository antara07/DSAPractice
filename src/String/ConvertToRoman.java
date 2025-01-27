package String;

public class ConvertToRoman {
    public static String convert(int num){
        int [] values = new int []{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String [] romans = new String[] {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        String result = "";
        for(int i=values.length-1; i>=0 && num>0; i--){
            while(num>=values[i]){
                num=num-values[i];
                result=result+romans[i];
            }
        }
        return result;
    }

}
