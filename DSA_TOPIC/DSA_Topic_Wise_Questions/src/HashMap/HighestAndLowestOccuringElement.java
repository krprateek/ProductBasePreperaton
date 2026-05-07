package HashMap;

import java.util.*;

public class HighestAndLowestOccuringElement {

    public static void main(String[] args) {
        int[] ar = {1,2,2,3,4,4,4,5,5};
        checkHighestandLowst(ar);
    }

    public static void checkHighestandLowst(int []ar)
    {
        HashMap<Integer,Integer> resultMap = new HashMap<>();
        for (int i=0 ;i< ar.length;i++)
        {
            resultMap.put(ar[i],resultMap.getOrDefault(ar[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> valLIst = resultMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();

        Map.Entry<Integer,Integer> high = valLIst.get(0);
        Map.Entry<Integer,Integer> low = valLIst.get(valLIst.size()-1);

        System.out.println(high.getKey() + "\t" + high.getValue());
        System.out.println(low.getKey() + "\t" + low.getValue());

    }
}
