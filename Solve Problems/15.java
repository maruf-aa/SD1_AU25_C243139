//Search for an element in an array

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
        int x = sc.nextInt();
        for (int i = 0; i < sz; i++) 
        {
            if (marks[i] == x) 
            {
                System.out.println("Found the number at index : " + i);
                return;
            }
        }
        System.out.println("Not Found");

    }
}
