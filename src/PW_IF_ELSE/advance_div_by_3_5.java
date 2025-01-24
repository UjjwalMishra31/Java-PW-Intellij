package PW_IF_ELSE;
import java.util.Scanner;
public class advance_div_by_3_5
{
    public static void main(String[] args)
    {   // div by 3 and 5 both
        // if not tell with [3,5]which it is not divisible
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        if (num%3 == 0)
        {
            if (num%5==0)
            {
                System.out.println("It is divisible by both 3 and 5");
            }
            else
            {
                System.out.println("It is divisible by 3 but not by 5");
            }
        }
        else if ( num % 5 == 0)
        {
            if (num % 3 == 0)
            {
                System.out.println("It is divisible by both 3 and 5 ");
            }
            else
            {
                System.out.println("It is divisible by 5 but not 3");
            }
        }
        else
        {
            System.out.println("It is not devisible by both 3 and 5");
        }
    }
}
