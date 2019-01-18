package collections;

import java.util.*;

public class findduplicateElements {

    public static void fndDuplicates(List<String> l1){
        Set<String> dupStore = new HashSet<String>(l1);
        HashMap<String,Integer> nondupStore = new HashMap<>();
        int count = 0;

        for(String key : dupStore ){
            System.out.println(key + " " + Collections.frequency(l1,key));
            nondupStore.put(key,Collections.frequency(l1,key));
            System.out.println(nondupStore);
        }



    }
    public static void main(String[] args){
        List<String> s1 =  new ArrayList<>(Arrays.asList("java1", "java1", "java1", "java1", "c", "cobol", "c", "cobol", "c++"));
        fndDuplicates(s1);
    }
}
