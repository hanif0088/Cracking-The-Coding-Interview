public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println( sumOfPrimeNumbers(100) );
	}
     
	static boolean isPrimeNumber(int number)
	{
		for(int x=2; x < number/2; x++)
		{
			if( number%x == 0)
			{
				return false;
			}
		}
		return true;
	}
	//Sum of first 1000 prime numbers, where size = 1000
	static int sumOfPrimeNumbers(int size)
	{
		int sum = 0;
		int number = 2;
		int count = 1;
		while(count <= size)
		{
			if( isPrimeNumber(number) )
			{
				sum = sum + number;
				count++;
			}
			number++;
		}
		return sum;
	}
}
