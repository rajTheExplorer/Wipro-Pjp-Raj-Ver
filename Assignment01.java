import java.util.Scanner;
class Assignment01
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        int sum=0;
        double avg=0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        }
        avg=sum/(double)arr.length;
        System.out.println("The sum of the elements in the array is "+sum);
        System.out.println("The average of elements in the array is "+avg);
    }
}