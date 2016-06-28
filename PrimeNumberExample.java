public class PrimeNumberExample
{

    public static void main(String args[])
    {
      System.out.println(isPrime(11));
    }

    // Prime number is not divisible by any number other than 1 and itself
    public static boolean isPrime(int number)
    {
        for(int i=2; i<number; i++)
        {
           if(number%i == 0)
           {
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
}
