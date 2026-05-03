package SlidingWindow;

public class MAxSizeOfSubArrayOfSizeK {

    public static void main(String[] args) {
        int k=3;
        int[] ar ={1,2,3,4,5,6,7};
        int res = findMaxSubarray(ar,k);
        System.out.println("max sum for sub array is : "  + res );
    }

    public static int findMaxSubarray(int[] ar,int k)
    {
        int i=0, j=0 ,sum=0, max=0;
        while(j<ar.length)
        {
            sum += ar[j];
            if(j-i+1<k)
            {
                j++;
            }
            else{
                max = Math.max(max,sum);
                sum -= ar[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
