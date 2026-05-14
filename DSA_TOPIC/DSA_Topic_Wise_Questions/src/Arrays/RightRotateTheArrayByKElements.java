package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateTheArrayByKElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = new int[]{1,2,3,4,5,6};
        System.out.print("input the value of k : ");
        int k = scanner.nextInt();
        scanner.nextLine();
        RightRotate(inputArray,k);
        Arrays.stream(inputArray).forEach(output -> System.out.print( output + "\t" ));
        System.out.println("\n");
        int[] inputArrayForLeftRotate = new int[]{1,2,3,4,5,6};
        leftRotate(inputArrayForLeftRotate,k);
        Arrays.stream(inputArrayForLeftRotate).forEach(output -> System.out.print(  output + "\t"));


    }

    public static void RightRotate(int[] arr,int k)
    {
        reverseAnArray(arr,0,arr.length-1);
        reverseAnArray(arr,0,k-1);
        reverseAnArray(arr,k,arr.length-1);
    }

    public static void leftRotate(int[] arr, int k)
    {
        int n = arr.length-1;
        reverseAnArray(arr,0,n);
        reverseAnArray(arr,0,n-k);
        reverseAnArray(arr, (n-k)+1, n);

    }

    public static void reverseAnArray(int[] arr,int start,int end)
    {
        int  i= start, j=end;
        while(i <j )
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }


    }

}
