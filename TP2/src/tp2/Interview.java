package tp2;

import java.util.*;
import java.util.stream.Collectors;

public class Interview {
    /**
     * Finds all pairs within values which sum up to targetSum
     * @param values All possible values that can form a pair (can contain duplicates)
     * @param targetSum Pairs should add up to this
     * @return A collection containing all valid pairs with no permutations, but all combinations (empty collection if none found)
     */
    public Collection<MatchingPair> matchingPairs(Collection<Integer> values, Integer targetSum){
        Map<Integer, Integer> pairs = new HashMap<>();
        Collection<MatchingPair> good = new LinkedList<>();

        /* version qui fonction presque en commentaire*/

        /*for (int i : values){
            if (pairs.containsKey(i)){
                if(pairs.get(i)!=null){
                    MatchingPair x = new MatchingPair(targetSum-i, i);
                    good.add(x);
                    pairs.remove(targetSum-i, i);
                }
            }
            else if (!pairs.containsValue(i)){
                pairs.put(targetSum -i , i);
            }
        }*/

        /*version expérimentale*/
        int value1 = 4;
        int value2 = 6;
        int value3 = 6;
        int value4 = 4;
        values.add(value1);
        values.add(value2);
        values.add(value3);
        values.add(value4);
        for (int i : values){
            if (pairs.containsKey(i)){
                MatchingPair x = new MatchingPair(targetSum-i, i);
                good.add(x);
                //pairs.remove(i, targetSum-i);
                System.out.println(pairs.get(i));
                pairs.put(i, null);

                System.out.println(pairs.get(i));

            }
            else if (!pairs.containsValue(i)){
                pairs.put(targetSum -i , i);
            }
            /*else{
                if (good.contains(i)){
                    for (int j : values){

                    }
                }
            }*/
        }


        System.out.println(good.size());
        return good;
    }
}

