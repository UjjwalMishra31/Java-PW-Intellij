package PW_Loops_Basics;

import java.util.Scanner;

public class AP_till_n_numbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int n = sc.nextInt();
        int m = n * 2;
        for (int i= 1 ; i<=m;i+=2)
        {
            System.out.println(i);
        }
    }
}
