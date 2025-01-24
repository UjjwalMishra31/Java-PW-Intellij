package PW_Loops_Basics;

import java.util.Scanner;

public class GP_till_n
{
    public static void main(String[] args)
    {//1,2,4,8,16,32...., n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth term");
        int n = sc.nextInt();
        int a=1,r=2;
        for (int i=1;i<=n;i++)
        {
            System.out.println(a);
            a = a*2;
        }
    }
}
