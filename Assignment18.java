import java.util.Scanner;
class Assignment17
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int temp=num;
        int rem;
        int sum=0;
        while(temp>0)
        {
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println("Its a palindrome");
        }
        else 
        {
            System.out.println("It is not a palindrome");
        }
    }
}