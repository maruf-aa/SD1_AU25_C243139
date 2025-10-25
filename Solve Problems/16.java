//Sort an array (Ascending Order)

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
            for (int j = i; j < sz; j++) 
            {
                if (marks[i] > marks[j]) 
                {
                    int temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        // Arrays.sort(marks); // built-in function to sort an array
        for (int i = 0; i < sz; i++) 
        {
            System.out.print(marks[i] + " ");
        }

    }
}
