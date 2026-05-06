package HashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] ar = new int[]{2,3,5,6,1};
        int target = 8;
        int[] res = ifTowSum(ar,target);
        if(res[0] != res[1])
        {
            System.out.println("Found to sum at index :" + res[0] + " " + res[1]);
        }
        else {
            System.out.println("nt found");
        }

    }

    public static int[] ifTowSum(int[] ar, int target)
    {
        Map<Integer,Integer> valAndIndex = new HashMap<>();
        for(int i=0;i<ar.length;i++)
        {
            valAndIndex.put(ar[i],i);
        }
        for(int i=0;i<ar.length;i++)
        {
            int valToCheck = target - ar[i];
            if(valAndIndex.containsKey(valToCheck) && valAndIndex.get(valToCheck) != i)
            {
                return new int[]{i,valAndIndex.get(valToCheck)};

            }
        }

        return new int[2];
    }
}

