package RecursionBasics;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] ar= {1,2,3,4};
        int i = 0;
        int l= ar.length-1;
        int mid = i +(l-i)/2;
       // Reverse(ar,i,l,mid);
        Reverse(ar,i,l);
        Arrays.stream(ar).forEach(System.out::println);
    }

    public static void Reverse(int[] ar, int f , int l , int mid)
    {
        int temp=0;
        if(l>mid)
        {
            temp = ar[f];
            ar[f] = ar[l];
            ar[l] = temp;
            Reverse(ar, f+1, l-1, mid);
        }
    }

    public static void Reverse(int[] ar, int f, int l)
    {
        if(f>=l) return;

        int temp = ar[f];
        ar[f]= ar[l];
        ar[l] = temp;

        Reverse(ar,f+1,l-1);
    }
}
