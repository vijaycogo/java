package SubSequence;


public class Subseq {
    //pvsm
    public static void main(String[]strings){
        String s = "vijay";
        removeAllA("", s);

        String res = removeAllA_in_original_String(s);
        System.out.println(res);
    }
    public static void removeAllA(String ans, String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char chars = s.charAt(0);

        if(chars=='a'){
            removeAllA(ans, s.substring(1));
        }
        else{
            removeAllA(ans + chars, s.substring(1));
        }
    }

    public static String removeAllA_in_original_String(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);

        if(ch=='a'){
            return removeAllA_in_original_String(s.substring(1));
        }
        else{
             return ch+ removeAllA_in_original_String(s.substring(1));
        }
    }
}
