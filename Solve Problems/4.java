//4. Find the maximum of 3 numbers: Take 3 numbers from user input, print the largest.

import java.util.*;
public class Firstclass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) 
        {
            System.out.println("Largest is " + a);
        } 
        else if(b > a && b > c)
        {
            System.out.println("Largest is " + b);
        }
        else
        {
            System.out.println("Largest is " + c);
        }
    }

}
