package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class FindFreqUsingStreams {
    public static void main(String[] args) {

        int[] ar = {1,2,2,3,4,4,4,5,5};

        Arrays.stream(ar).boxed().collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting())).forEach((key, value) -> System.out.println(key + "\t" + value));
    }


}
