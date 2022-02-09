import java.util.Scanner;
class Assignment05
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character");
        char c=sc.next().charAt(0);
        int conCharInt=c;
        if((conCharInt>=97 && conCharInt<=122)||(conCharInt>=65 && conCharInt<=91))
        {
            System.out.println("Alphabet");
        }
        else if(conCharInt>=48 && conCharInt<=57)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Special Character");
        }
    }
}