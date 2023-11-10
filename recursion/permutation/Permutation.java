package permutation;
import java.util.ArrayList;


public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");

        System.out.println(permutationCount("", "abc"));

        ArrayList<String> result =permutationkunalArray("", "abc");
        System.out.println(result);
        //   https://www.youtube.com/watch?v=xZykmhcWGuY
        permutationkunal("", "abc");

    }

    public static void permutation(String ans, String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<original.length(); i++){
            char current = original.charAt(i);
            String newString = original.substring(0, i) + original.substring(i+1) ;
            permutation(ans + current, newString);
        }
    }



    public static int permutationCount(String ans, String original){
        if(original.isEmpty()){
            
            return 1;
        }
        int count = 0;
        for(int i=0;i<original.length(); i++){
            char current = original.charAt(i);
            String newString = original.substring(0, i) + original.substring(i+1) ;
            count =  count + permutationCount(ans + current, newString);
        }
        return count;
    }

    public static ArrayList<String> permutationkunalArray(String ans, String original){
        if(original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> arraylist = new ArrayList<>();
        char current = original.charAt(0);

        for(int i=0;i<=ans.length(); i++){
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            arraylist.addAll(permutationkunalArray(f + current + s, original.substring(1)));
        }
        return arraylist;
    }

    public static void permutationkunal(String ans, String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
        char current = original.charAt(0);
        for(int i=0;i<=ans.length(); i++){
            String f = ans.substring(0, i);
            String s = ans.substring(i, ans.length());
            permutationkunal(f + current + s, original.substring(1));
        }
    }
    
}
