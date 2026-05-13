package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//Optimal approach is using 2 variable highest and 2nd highest and then comparing each value with highest and then further comparing the val>2ndHigthest
// && val!= highest then assign to 2ndHightest .. this will require a single loop and TimeComplexity will be O(n)

//not optimal approach
public class SecondLargestElementInArray {

    public static void main(String[] args) {

        FindSecondLargest(new int[]{1,2,4,7,8,10});
    }

    public static void FindSecondLargest(int[] arr)
    {
        Queue<Integer> queue = new PriorityQueue<>();

        for(int eachValue : arr)
        {
            queue.add(eachValue);
            if(queue.size()>2)
            {
                queue.poll();
            }


            queue.stream().forEach(output-> System.out.print(output + "\t"));
            System.out.println("**********");
        }

        System.out.println(queue.peek());


    }
}
