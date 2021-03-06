//Write a program to reverse a number using numeric operations
public class NumberReverse
{
    public int reverseNumber(int number)
    {
        int reverse = 0;
        while(number != 0)
        {
            reverse = reverse * 10;
            reverse = reverse +(number%10);
            number = number/10;
        }
        return reverse;
    }

    public static void main(String a[])
    {
        NumberReverse nr = new NumberReverse();
        System.out.println("Result: "+nr.reverseNumber(17868));
    }
}