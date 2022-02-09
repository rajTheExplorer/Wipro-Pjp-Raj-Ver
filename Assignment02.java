import java.util.Scanner;
class Assignment02
{
    public static void main(String[] args)
    {
        int[] arr={1,2,78,4,5,6};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        for(int j=0;j< arr.length;j++)
        {
            if(arr[j]>max)
            {
                max=arr[j];
            }
        }
        System.out.println("The minimum of the elements in the array is "+min);
        System.out.println("The maximum of elements in the array is "+max);
    }
}