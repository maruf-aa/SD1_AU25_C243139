//Store and print 5 numbers in an array

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

        for (int i = 0; i < sz; i++) 
        {
            System.out.print(marks[i] + " ");
        }   
        
    }
}
