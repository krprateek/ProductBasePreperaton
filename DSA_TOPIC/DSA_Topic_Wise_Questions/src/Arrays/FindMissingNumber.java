package Arrays;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        findMissing(new int[]{8, 2, 4, 5, 3, 7, 1});
    }

    public static void findMissing(int[] arr)
    {
        int sum = 0;
        int n= arr.length+1; //Added +1 since one number is missing
        int expSum = 0;
        int length = arr.length;
        for (int i =0;i<length ; i++)
        {
            sum += arr[i];
        }

        expSum = n * (n + 1) / 2;
        System.out.println(length);
        System.out.println(sum);


        System.out.println("Missing number is : " + (expSum-sum));
    }
}
