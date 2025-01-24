package PW_IF_ELSE;
import java.util.*;
public class Three_digit_number
{
    public static void main(String[] args)
    {       // Tell whether the input is a 3 digit number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        if (num > 99 && num <=999)
        {
            System.out.println("It is a three digit number");
        }
        else
        {
            System.out.println("No, it is not a three digit number");
        }

    }
}
