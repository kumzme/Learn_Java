package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ExampleCollections {

    public static ArrayList<Integer> removeduplicates(ArrayList<Integer> a1){

        ArrayList<Integer> newList = new ArrayList<>();
        for(int i = 0 ; i < a1.size(); i++){
            if(!newList.contains(a1.get(i))){
                newList.add(a1.get(i));
            }
        }
        return newList;
    }
    public static void main(String[] args){
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1,10,2,10,2,1,11,4,5,5,6,4,7,6,5,8,9));
        System.out.println(a2);
        ArrayList<Integer> nonDuplicates = removeduplicates(a2);
        System.out.println(nonDuplicates);
    }
}
