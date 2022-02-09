import java.util.*;
class Assignment05
{
    public static void main(String[] args)
    {
        int[] arr={78,25,47,29,74};
        int temp;
        Arrays.sort(arr);
        int smallest=arr[0];
        int secondSmallest=arr[1];
        int largest=arr[arr.length-1];
        int secondLargest=arr[arr.length-2];
        System.out.println(smallest);
        System.out.println(secondSmallest);
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}