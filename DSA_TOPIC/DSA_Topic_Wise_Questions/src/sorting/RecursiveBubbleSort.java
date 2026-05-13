package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {

        int[] ar = {4,3,2,1};
        int length = ar.length;
        bubbleSortRecursively(ar,length);
        Arrays.stream(ar).forEach(output -> System.out.print(output + "\t"));

    }

    public static void bubbleSortRecursively(int[] arr,int length)
    {
        if(length==1) return;
        for(int i=0 ; i< length-1;i++)
        {
            if(arr[i+1] < arr[i])
            {
                int temp= arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSortRecursively(arr,length-1);

    }
}
