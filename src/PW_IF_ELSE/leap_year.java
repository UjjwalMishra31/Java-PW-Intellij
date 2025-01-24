package PW_IF_ELSE;
import java.util.*;
public class leap_year {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int x = sc.nextInt();
        if (x%4==0)
        {
            System.out.println("Year "+x+" is a leap year");
        }
        else
        {
            System.out.println("Year "+x+" is not a leap year");
        }
    }
}
