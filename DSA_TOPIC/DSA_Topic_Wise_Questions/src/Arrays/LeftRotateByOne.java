package Arrays;

import java.util.Arrays;

public class LeftRotateByOne {

    public static void main(String[] args) {

        rotateArrayByOne(new int[]{1,2,3,4,5});
        //o/p 2,3,4,5,1

        OptimalAppRotate(new int[]{1,2,3,4,5});
    }

    public static void rotateArrayByOne(int[] arr)
    {
        int i =0;
        for(int j=1;j<arr.length;j++)
        {

            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j] = temp;
        }

        Arrays.stream(arr).forEach(output -> System.out.print(output + "\t"));

    }

    public static void OptimalAppRotate(int[] arr)
    {
        int temp = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        Arrays.stream(arr).forEach(output -> System.out.print(output + "\t"));
    }
}
