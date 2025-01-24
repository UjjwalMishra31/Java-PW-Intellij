package Test_yourself;

import java.util.Scanner;

public class prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        boolean num1= false;
        for(int i = 2; i<num ; i++ ) {
            if (num % 2 == 0) {
                num1 = true;
                break;
            }
        }
        if (num == 1)
            System.out.println("Lauda lele");
        else if (num1 == true)
        {
            System.out.println("composite");
        }
        else
        {
            System.out.println("prime");
        }
    }
}
