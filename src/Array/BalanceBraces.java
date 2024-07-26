package Array;

public class BalanceBraces {
    public static boolean check(String exp){
        char [] bucket = new char[exp.length()];
        int head=-1;
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='[' || exp.charAt(i)=='{' || exp.charAt(i)=='('){
                head++;
                if(head<bucket.length)
                    bucket[head]=exp.charAt(i);
            } else if (exp.charAt(i)==']' || exp.charAt(i)=='}' || exp.charAt(i)==')') {
                if(head>-1){
                    char val = bucket[head];
                    head--;
                    if(exp.charAt(i)==']' && val!='[')
                        return false;
                    else if (exp.charAt(i)=='}' && val!='{')
                        return false;
                    else if (exp.charAt(i)==')' && val!='(')
                        return false;
                }
            }
        }
        return head == -1;
    }
}
