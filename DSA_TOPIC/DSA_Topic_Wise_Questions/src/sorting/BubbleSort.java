package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        doBubbleSort(new int[]{3,4,1,6,5,2});
    }

    public static void doBubbleSort(int[] ar){

        int n=ar.length-1;
        for(int i=0;i< n;i++)
        {

            for(int j=0;j<n-i;j++)
            {
                if(ar[j+1]<ar[j])
                {
                    int temp = ar[j];
                    ar[j]= ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }

        Arrays.stream(ar).forEach(System.out::println);

    }
}
