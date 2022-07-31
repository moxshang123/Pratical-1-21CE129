// Name : MOXSHANG SHAH
// ID : 21CE129

// Aim:
// Display numbers in a pyramid pattern.
//                  1
//                1 2 1
//              1 2 4 2 1
//            1 2 4 8 4 2 1
//          1 2 4 8 16 8 4 2 1
//       1 2 4 8 16 32 16 8 4 2 1
//    1 2 4 8 16 32 64 32 16 8 4 2 1
// 1 2 4 8 16 32 64 128 64 32 16 8 4 2 1

import java.util.*;
public class Practical_7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = " ";

        // entering the value for how many rows we want to print 
        System.out.println("Enter the value : ");
        int no = sc.nextInt();

        //number for counting 
        int number = 0;
        for (int row = 0; row <= no-1; row++) 
        {
            // first for loop will print the spaces for the right side shifted triangle
            for (int col = 0; col <= no-1 - row; col++) 
            {
                System.out.printf("%4s", str);
            }

            // this for loop will print the values in right shifted triangle
            for (int col = 0; col <= row; col++) 
            {
                number = (int) Math.pow(2, col);
                System.out.printf("%4d", number);
            }
            
            // this for loop will print the values for the left side shifted triangle
            for (int col = row - 1; col >= 0; col--) 
            {
                number = (int) Math.pow(2, col);
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
        sc.close();
    }
}