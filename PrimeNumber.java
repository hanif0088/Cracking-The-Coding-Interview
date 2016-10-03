public class PrimeNumber
{

     public static void main(String []args)
     {
        System.out.println("Hello World");
        System.out.println( isPrimeNumber(4)) ;
     }
     static boolean isPrimeNumber(int number)
     {
         for(int x=2; x < number; x++)
         {
             if((number % x) == 0)
             {
                 return false;
             }
         }
         return true;
     }
}
