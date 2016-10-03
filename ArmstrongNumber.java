/* An Armstrong number is a 3 digit number for which sum of cube of its digits is equal to the number itself.
An example of Armstrong number is 153 as 153= 1+ 125+27 which is equal to 1^3+5^3+3^3 */

public class ArmstrongNumber
{
     public static void main(String []args)
     {
        System.out.println( isArmstrong(7));
     }

     static boolean isArmstrong(int number)
     {
         int original = number;
         int result = 0;
         while(number != 0)
         {
             int remainder = number%10;
             result = result + remainder*remainder* remainder;
             number = number/10;
         }

         if ( original == result)
         {
             return true;
         }
         else
         {
             return false;
         }
     }
}
