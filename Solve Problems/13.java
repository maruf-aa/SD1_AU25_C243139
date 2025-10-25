//Calculate the average of an array

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

        int sum = 0;
        for (int i = 0; i < sz; i++) 
        {
            sum += marks[i];
        }
        
        System.out.println("Average marks: " + (double)(sum )/ sz);
    }
}
