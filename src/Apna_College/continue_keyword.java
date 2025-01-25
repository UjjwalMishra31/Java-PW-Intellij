package Apna_College;

import java.util.Scanner;

public class continue_keyword
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while(x <= 100)
        {
            if (x==10)
            {
                continue;
            }
            System.out.println(x);
            x++;
        }
    }
}
