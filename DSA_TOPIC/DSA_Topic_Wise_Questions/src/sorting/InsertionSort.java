package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        doInsertionSort(new int[] {4,8,3,5,9,6,2});
    }
    public static void doInsertionSort(int[] ar)
    {
        for(int i=1;i<ar.length;i++)
        {
            int min= ar[i];
            int j= i-1;
            while(j>=0 && ar[j]>min)
            {
                ar[j+1] = ar[j];
                j--;
            }

            ar[j+1] = min;

        }

        Arrays.stream(ar).forEach(output -> System.out.print(output + "\t"));

    }
}

