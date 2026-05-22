package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class findTheElementOccuringOne {

    public static void main(String[] args) {
        findSol(new int[]{4,1,2,1,2});

    }

    public static void findSol(int[] arr)
    {
        Integer res= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Integer::valueOf,Collectors.counting())).
               entrySet().stream().filter(output -> output.getValue()==1).map(Map.Entry::getKey).findFirst().get();

        System.out.println(res);

    }
}
