package hasset;

import java.util.HashSet;
import java.util.*;

public class HasSet {
    public static void main(String[] args) {
        HashSet<String> ha = new HashSet<>();
        ha.add("vijay");
        ha.add("kumar");
        ha.add("vijay");
        System.out.println(ha);


        List<String> list = new ArrayList<>();
        list.add("vijay");
        list.add("kumar");
        list.add("vijay");
        System.out.println(list);

    }
}
