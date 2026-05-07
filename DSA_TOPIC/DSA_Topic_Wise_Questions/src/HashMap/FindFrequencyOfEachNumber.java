package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfEachNumber {

    public static void main(String[] args) {
        int[] ar = {1,2,2,3,4,4,4,5,5};
        checkFreq(ar);
    }

    public static void checkFreq(int[] ar)
    {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int i=0; i<ar.length ; i++)
        {
            freqMap.put(ar[i], freqMap.getOrDefault(ar[i],0) +1);
        }

        for(Map.Entry<Integer,Integer> mapValue : freqMap.entrySet()){
            System.out.println(mapValue.getKey() + "\t" + mapValue.getValue());
        }
    }
}
