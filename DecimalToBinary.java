// Write a program to convert decimal number to binary format using numeric operations.

public class DecimalToBinary
{
     public static void main(String []args)
     {
        decimalToBinary(5);
     }
     
     public static void decimalToBinary(int input)
     {
        int decimal = input;
        int binary[] = new int[100];
        int index = 0;
        
        while(decimal>0)
        {
            binary[index] = decimal % 2;
            index++;
            decimal = decimal / 2;
        }
        
        for(int x = index-1; x>=0; x-- )
        {
            System.out.print( binary[x] );
        }
     }
}
