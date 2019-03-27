package Tasks.L7Task1;

import java.util.ArrayList;
import java.util.List;

public class Decoder {
    public static void stringToNumber(List<Pair> pairs, String string){
        char[] chArray = string.toCharArray();
        List<Integer> newList = new ArrayList<>();
        for(Character c: chArray){
            for (Pair p: pairs ){
                if(p.getSecond()==c){
                    newList.add((Integer) (p.getFirst()));
                }
            }
        }
        for(Integer i : newList){
            System.out.print(i);
        }
    }
    public static void numberToString(List<Pair> pairs,int a){
        List<Integer> nums = new ArrayList<>();
        List<Character> newList = new ArrayList<>();
        while (a != 0) {
            nums.add(a % 10);
            a /= 10;
        }
        for (Integer i : nums){
            for (Pair p: pairs){
                if(p.getFirst()==i){
                    newList.add((Character)(p.getSecond()));
                }
            }
        }
        for (Character c : newList){
            System.out.print(c);
        }
    }

}
