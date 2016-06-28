// Calculating a factorial

public class Factorial
{
     public static void main(String []args)
     {
        System.out.println(Factorial.factorial_iterative(5));

     }
     
     public static int factorial_iterative(int num)
     {
         if ( num < 0 )
         {
             System.out.println("Factorial must be a positive integer.");
             return 0;
         }
    
         // Start at 1 since we're multiplying, not adding
         int fact = 1;
    
         // Loop from 1-num and multiply each time to fact
         for (int i = 1; i <= num; i++)
         {
             fact = fact*i;
         }
    
         return fact;
     }
}