// Write a program to print fibonacci series.

public class MyFibonacci 
{
    public static void main(String a[])
    {  
         int febCount = 15;
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < febCount; i++)
         {
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< febCount; i++)
         {
             System.out.print(feb[i] + " ");
         }
         //Using recursion
         for(int i = 1; i<= 15; i++)
         {
            System.out.println( fibonacci(i) ); 
         }
    }
     public static int fibonacci(int number)
     {
         if(number == 1 || number == 2)
         {
             return 1;
         }
         return fibonacci(number - 1) + fibonacci(number - 2);
     }
}
