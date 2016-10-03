public class SwapTwoNumbers
{
     public static void main(String []args)
     {
        // Swap two numnbers without a third variable
        int x = 5;
        int y = 6;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x+" and " + y);

        // Method two
        int a = 3;
        int b = 4;
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a+ " & " + b);
     }
}
