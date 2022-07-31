// NAme : Moxshang Shah
// ID : 21CE129

// Aim : Given a string, return a string made of the
//       first 2 chars (if present), however include
//       first  char  only  if  it  is  'o' and  
//       include  the  second  only  if  it  is  'z', 
//       so  "ozymandias" yields "oz".
//       startOz("ozymandias") → "oz"
//       startOz("bzoo") → "z"
//       startOz("oxx") → "o"

import java.util.Scanner;
class Practical_2
{
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // defining the stirng
      String str = sc.nextLine();
      // calling the startOZ function 
      startOZ(str);
        sc.close();
    }
    // user defined method for startOZ function
    static void startOZ(String str)
    {
        // logic for the first letter
      if(str.charAt(0) == 'o' || str.charAt(0) == 'O')
      {
        System.out.print(str.charAt(0));
      }
      // logic for the second letter
      if(str.charAt(1) == 'z' || str.charAt(1) == 'Z')
      {
        System.out.println(str.charAt(1));
      }
    }
}