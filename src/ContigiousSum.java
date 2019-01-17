/**
 * Created by shobhitgarg on 1/16/19.
 */

// Kadane's Algorithm
//Contigious Sum

public class ContigiousSum {
    int arr1[] = {1, 2, 3, -2, 5};
    int arr2[] = {-1, -2, -3, -4};

    public static void main(String args[])  {
        ContigiousSum obj = new ContigiousSum();
        System.out.println(obj.findContigiousSum(obj.arr2));
    }

    int findContigiousSum(int arr[])    {
        int max = 0, maxSoFar = 0;
        for(int i = 0; i< arr.length; i++)  {
            maxSoFar +=arr[i];
            if(maxSoFar < 0)    {
                maxSoFar = 0;
            }
            if(max < maxSoFar)  {
                max = maxSoFar;
            }
        }
        return max;
    }

    // this is better since it also handles the case with all the negative numbers, check whether the numerically biggest negative number needs to be returned or 0.
    int findContigiousSum(int arr[], int size)    {
        int max = arr[0], maxSoFar = arr[0];
        for(int i = 1; i< arr.length; i++)  {
            maxSoFar = Math.max(arr[i], maxSoFar + arr[i]);
            max = Math.max(max, maxSoFar);
        }
        return max;
    }

}
