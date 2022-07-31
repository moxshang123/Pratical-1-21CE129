// Name : MOXSHANG SHAH
// ID : 21CE129

// Aim :
// Implement Caesar Cipher

import java.util.*;
class Practical_10
{
    // storing the text and shift into the sting buffer datatype
    public static StringBuffer encrypt(String txt, int s)
    {
        StringBuffer res= new StringBuffer();
  
        for (int i=0; i<txt.length(); i++)
        {
            if (Character.isUpperCase(txt.charAt(i)))
            {
                // logic for the capital letters encryption
                char c = (char)(((int)txt.charAt(i) + s - 65) % 26 + 65);
                // appends the converted char.
                res.append(c);
            }
            else
            {
                // logic for the small letters encryption
                char c = (char)(((int)txt.charAt(i) + s - 97) % 26 + 97);
                // appends the converted char.
                res.append(c);
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        // enter the capital string only
        System.out.println("Enter Text  : ");
        String txt = sc.next();
        // enter the shifting you want
        System.out.println("Enter the Shift : ");
        int s = sc.nextInt();
        System.out.println("Cipher text is : " + encrypt(txt, s));
        sc.close();
    }
}