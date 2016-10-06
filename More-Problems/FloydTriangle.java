/*
Floyd Triangle is like
1
2 3
4 5 6
7 8 9 10
*/

public class FloydTriangle
{
     public static void main(String []args)
     {
        int maxRow = 5;
        int number = 1;
        int row, col;
        
        for(row = 1; row <= maxRow; row++)
        {
            for( col = 1; col <= row; col++)
            {
                System.out.print( number+" ");
                number++;
            }
            System.out.println();
        }
     }
}
