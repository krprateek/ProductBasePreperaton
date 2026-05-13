package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] ar = {9,6,5,0,8,2,4,7};
        doQuickSort(ar,0,ar.length-1);
        Arrays.stream(ar).forEach(output -> System.out.print(output + "\t"));
    }

    public static void doQuickSort(int[] ar, int start, int end)
    {

        if(start<end)
        {
            int pivot = Partition(ar,start,end);
            doQuickSort(ar,start,pivot-1);
            doQuickSort(ar,pivot+1,end);
        }
    }

    public static int Partition(int[] arr,int start,int end)
    {
        int pivot = arr[end];
        int i = start -1;
        for (int j = start;j<end;j++)
        {
            if(arr[j]<= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end]=temp;

        return i+1;
    }
}
