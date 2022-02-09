import java.util.Scanner;
class Assignment03
{
    public static void main(String[] args)
    {
        int[] arr={1,3,34,56,7};
        Scanner sc=new Scanner(System.in);
        int searchElement=sc.nextInt();
        int index=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==searchElement)
            {
                index=i;
            }
        }
        if(index!=Integer.MIN_VALUE)
        {
            System.out.println(index);
        }
        else
        {
            System.out.println(-1);
        }
    }
}