package SubSequence;

public class SkipSubseq {
    public static void main(String[] args) {
        String s = "Hello World! vijayeatapple";
        String removed = "apple";//

        String ans = skipapple(s, "", removed);
        System.out.println(ans);
        System.out.println(s);

        // inplace and we use here polymorphysm 
        String res = skipapple(s,removed);
        System.out.println(res);
    }

    public static String skipapple(String s, String ans, String removed) {
        if(s.isEmpty()){
            return ans;
        }

        if(s.startsWith(removed)){
            return skipapple(s.substring(removed.length()), ans, removed);
        }
        else{
            return s.charAt(0) + skipapple(s.substring(1), ans, removed);
        }
    }



    public static String skipapple(String s, String removed){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith(removed)){
            return skipapple(s.substring(removed.length()), removed);
        }
        else{
            return s.charAt(0) + skipapple(s.substring(1), removed);
        }
    }
}
