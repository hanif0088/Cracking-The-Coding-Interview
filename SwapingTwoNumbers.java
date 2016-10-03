//How to swap two numbers without using temporary variable?

public class SwapingTwoNumbers 
{
	public static void main(String[] args) 
	{
		int x= 10;
		int y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x is "+ x+" & y is "+ y);
	}
}
