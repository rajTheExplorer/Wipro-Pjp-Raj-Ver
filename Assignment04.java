import java.util.Scanner;
class Assignment04
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first character");
        char first=sc.next().charAt(0);
        System.out.println("Enter your second character");
        char second=sc.next().charAt(0);
        if((int)first>(int)second)
        {
            System.out.println(second+","+first);
        }
        else
        {
            System.out.println(first+","+second);
        }
    }
}