public class BinaryToDecimal
{
     public static void main(String []args)
     {
        System.out.println( binaryToDecimal(111) );
     }
     
     public static int binaryToDecimal(int input)
     {
        int binary = input;
        int decimal = 0; 
        int remainder = 0;
        int power = 0;
        
        while( binary!= 0)
        {
            remainder = binary % 10;
            decimal = decimal + (int) ( remainder * Math.pow(2,power) ) ;
            power++;
            
            binary = binary/ 10;
        }
        return decimal;
     }
}
