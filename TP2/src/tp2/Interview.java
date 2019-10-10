package tp2;

import java.util.*;
import java.util.stream.Collectors;

public class Interview {
    /**
     * Finds all pairs within values which sum up to targetSum
     *
     * @param values    All possible values that can form a pair (can contain duplicates)
     * @param targetSum Pairs should add up to this
     * @return A collection containing all valid pairs with no permutations, but all combinations (empty collection if none found)
     */
    public Collection<MatchingPair> matchingPairs(Collection<Integer> values, Integer targetSum) {
        Map<Integer, Integer> pairs = new HashMap<>();
        Collection<MatchingPair> good = new LinkedList<>();
        Integer temp;



        Iterator iterator = values.iterator();
        while (iterator.hasNext()) {
            temp = (Integer) iterator.next();
            if (pairs.containsKey(temp)) {
                if (pairs.get(temp) != null) {
                    MatchingPair x = new MatchingPair(targetSum - temp, temp);
                    good.add(x);

                }
            } else if (!pairs.containsValue(temp)) {
                pairs.put(targetSum - temp, temp);
            } else if (pairs.containsValue(temp)) {
                Iterator iterator2 = values.iterator();
                Map<Integer, Integer> pairs2 = new HashMap<>();
                Integer temp2;
                while (iterator2.hasNext()) {
                    temp2= (Integer) iterator2.next();
                    if (pairs2.containsKey(temp2)) {
                        if (pairs2.get(temp2) != null) {
                            MatchingPair x = new MatchingPair(targetSum - temp2, temp2);
                            good.add(x);
                        }
                    } else if (!pairs2.containsValue(temp2)) {
                        pairs2.put(targetSum - temp2, temp2);
                    }
                }
            }

        }

        return good;
    }

}