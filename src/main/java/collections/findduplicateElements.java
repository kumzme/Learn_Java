package collections;

import java.util.*;

import static java.lang.Integer.*;

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
    public static LinkedHashMap<String, Integer> findDups(List<String>l2){

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for(String str : l2) {
            Integer count = linkedHashMap.get(str);
            if (count == null) {
                linkedHashMap.put(str, 1);
            } else {
                linkedHashMap.put(str, ++count);
            }
        }
            return linkedHashMap;

    }
    public static void main(String[] args){
        List<String> s1 =  new ArrayList<>(Arrays.asList("java1", "java1", "java1", "java1", "c", "cobol", "c", "cobol", "c++"));
        fndDuplicates(s1);
        LinkedHashMap<String,Integer> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1=  findDups(s1);
        System.out.println(linkedHashMap1);
    }
}
