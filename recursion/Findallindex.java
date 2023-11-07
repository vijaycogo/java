import java.util.ArrayList;

public class Findallindex {
    
    public static void main(String[]strings){
        int []a={1,2,4,5,4,2};
        int target = 4;
        // findallindex(a,0, target,new ArrayList<>());
        // System.out.println(findallindex(a,0, target,new ArrayList<>()));
        System.out.println(findallindexWithoutArgument(a, 0, target));
    }

    static ArrayList<Integer> findallindex(int[]a, int  index, int target, ArrayList<Integer>list){
        if(index==a.length-1){
            return list;
        }

        if(a[index] == target){
            list.add(index);
        }
        return findallindex(a,index+1,target,list);

    }

    static ArrayList<Integer> findallindexWithoutArgument(int []a, int index,int target){
        
        ArrayList<Integer> list = new ArrayList<>();
        if(index==a.length){
            return list;
        }
        if(a[index]==target){
            list.add(index);
        }
        ArrayList<Integer> getallbelowindex = findallindexWithoutArgument(a,index+1,target);
        list.addAll(getallbelowindex);
        return list;
    }
}
