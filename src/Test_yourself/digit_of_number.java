package Test_yourself;

import java.util.Scanner;

public class digit_of_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int x = sc.nextInt();
        int count = 0;
        while(x!=0)
        {
            x = x / 10;
            count ++;
        }
        System.out.println(count);
    }
}
