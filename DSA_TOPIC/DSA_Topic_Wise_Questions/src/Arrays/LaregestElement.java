package Arrays;

public class LaregestElement {

    public static void main(String[] args) {

        FindLargest(new int[]{1,5,3,4});
    }

    //Brute force approch , sort the array in desc order and take the element at index 1;
    // lime complexity will be nlogn

    //Optimal approche
    public static void FindLargest(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }

        System.out.println("largest element is: " + max );
    }


}
