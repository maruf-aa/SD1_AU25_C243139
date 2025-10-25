//Count even and odd numbers in an array

import java.util.*;
public class Firstclass {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();

        int marks[] = new int[sz];

        for (int i = 0; i < sz; i++) 
        {
            marks[i] = sc.nextInt();
        }

        int cnteven = 0;
        int cntodd = 0;
        for (int i = 0; i < sz; i++) 
        {
            if (marks[i] % 2 == 0) 
            {
                cnteven++;
            } 
            else 
            {
                cntodd++;
            }
        }
        
        System.out.println("Even numbers: " + cnteven);
        System.out.println("Odd numbers: " + cntodd);
    }
}
