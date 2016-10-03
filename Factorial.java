public class Factorial
{
     public static void main(String []args)
     {
        System.out.println( factorialLoop(3) );
     }

     //Using Recursion
     static int factorialRecursion(int x)
     {
         //base case
         if(x==0)
         {
             return 1;
         }
         return x*factorialRecursion(x-1);
     }

     //Using a loop
     static int factorialLoop(int x)
     {
         int result = 1;
         for(int a = x; a > 0; a--)
         {
             result = result * a;
         }
         return result;
     }
}
