package Arrays;

import java.util.Arrays;

public class RemoveDuplicateInPlaceForSortedArray {

    public static void main(String[] args) {

       // RemoveDuplicate(new int[]{1,1,1,2,2,3,3,3,3,4,4});

        int[] newArray = new int[]{1,1,1,2,2,3,3,3,3,4,4,5,5,5};
        int index = UsingTwoPointers(newArray);
        for(int i=0 ;i<index;i++)
        {
            System.out.print(newArray[i] + "\t");
        }

    }

    public static void RemoveDuplicate(int[] ar)
    {
        int valueToPutInNewArray =0 ,j=0;
        int[] res = new int[ar.length];
        for(int i =0;i<ar.length-1;i++)
        {
            if(ar[i]==ar[i+1] && valueToPutInNewArray!=ar[i])
            {
                valueToPutInNewArray=ar[i];
                res[j++] = valueToPutInNewArray;
            }
        }
        Arrays.stream(res).forEach(output -> System.out.print(output + "\t"));


    }


    //Brut force approach is to use set
    //Optimal Approach is using two pointers

    //using toPointers
    public static int UsingTwoPointers(int[] ar)
    {
        int i=0;
        for(int j=1;j<ar.length;j++)
        {
            if(ar[i]!=ar[j])
            {
                i++;
                ar[i] = ar[j];
            }
        }

        return i+1;
    }
}
