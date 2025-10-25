//Find the largest number in an array

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

        int max = marks[0];
        for (int i = 0; i < sz; i++) 
        {
            if (marks[i] > max) 
            {
                max = marks[i];
            }
        }
        System.out.println("Maximum marks: " + max);
    }
}
