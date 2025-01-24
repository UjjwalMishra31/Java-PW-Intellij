package PW_Loops_Basics;

import java.util.Scanner;

public class AP_from_4_7_10_13_till_n
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int n = sc.nextInt();
        int m = n*3;
        for (int i = 4;i<=m+1;i+=3)
        {
            System.out.println(i);
        }
    }
}
