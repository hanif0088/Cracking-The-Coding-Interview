/*two String are called anagram, if they contains same characters but on 
different order e.g. army and mary, stop and pots etc. */

import java.util.Arrays;

public class AnagramString
{
     public static void main(String []args)
     {
        System.out.println( isAnagram("hanif", "finha") );
     }
     
     public static boolean isAnagram(String word, String anagram)
     {
         char[] wordArray = word.toCharArray();
         char[] anagramArray = anagram.toCharArray();
         Arrays.sort(wordArray);
         Arrays.sort(anagramArray);
         
         return Arrays.equals(wordArray, anagramArray);
     }
}
