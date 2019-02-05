/**
 * Created by shobhitgarg on 2/4/19.
 */
public class SubarrayWithGivenSum {

    public static void main(String[] args) {
    int arr [] = new int[]{135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
    int sum = 468;
    SubarrayWithGivenSum obj = new SubarrayWithGivenSum();
    obj.findSubArrayWithSum(arr, sum);
    }

    void findSubArrayWithSum(int[] arr, int sum)    {
        int start = 0, end = 0;
        int sumSoFar = 0;
        for(int i = 0; i < arr.length; i++) {
            sumSoFar = sumSoFar+arr[i];
            while(sumSoFar>sum)    {
                sumSoFar = sumSoFar - arr[start];
                start ++;
            }
            if(sumSoFar == sum) {
                System.out.println((start+1) + " " + (end + 1));
                return;
            }
            end ++;
        }
        System.out.println(-1);
    }
}
