package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        int[] ar = {4,2,3,9,5,1};

        MrgSort(ar,0,ar.length-1);
        Arrays.stream(ar).forEach(output -> System.out.print(output + "\t"));

    }

    public static void MrgSort(int ar[] , int first, int last)
    {
        if(first>=last)
        {
            return;
        }

        int mid = first + (last- first)/2;
        MrgSort(ar,first,mid);
        MrgSort(ar,mid+1,last);
        merge(ar,first,last,mid);


    }

    public static void merge(int[] ar,int first , int last, int mid)
    {
        List<Integer> tempArray = new ArrayList<>();
        int left=first , right= mid+1;

        while(left<=mid && right<=last)
        {
            tempArray.add(ar[left]<=ar[right] ? ar[left++] : ar[right++]);
        }

        while(left<=mid)
        {
            tempArray.add(ar[left++]);
        }

        while(right<=last)
        {
            tempArray.add(ar[right++]);
        }
        for(int i = first; i<=last;i++){

            ar[i] = tempArray.get(i-first);
        }
    }
}
