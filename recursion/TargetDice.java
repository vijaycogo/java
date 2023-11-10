import java.util.ArrayList;

// import java.util.Scanner;

public class TargetDice {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int target = sc.nextInt();
        // findPossibleCombination("", 7);
        System.out.println(returnDiceCombination("",4));

        System.out.println(countDiceCombination("", 4));
    }

    public static void findPossibleCombination(String ans, int target){
        if(target ==0){
            System.out.println(ans);
            return;
        }
        
        for(int i=1;i<=6 && i <= target;i++){
            findPossibleCombination(ans + i, target -i);
        }
    }

    public static ArrayList<String> returnDiceCombination(String ans, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=6 && i<=target; i++){
            list.addAll(returnDiceCombination(ans + i , target - i ));
        }
        return list;
    }

    public static int countDiceCombination(String ans, int target){

        if(target == 0){
            return 1;
        }
        int count = 0;
        for(int i=1;i<=6 &&  i<= target;i++){
            count  = count + countDiceCombination(ans + i, target -i);
        }
        return count;
    }
}
