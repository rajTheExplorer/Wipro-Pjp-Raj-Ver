import java.util.Scanner;
class Assignment07
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>=97 && c<=122)
        {
            System.out.println((char)(c-32));
        }
        else
        {
            System.out.println((char)(c+32));
        }
    }
}