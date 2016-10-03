/* Find The First Non Repeated Character In A String 
   If the word "stress" is input  then it should print  't'   as output .
   If the word "teeter" is input  then it should print  'r'   as output .
*/

import java.util.HashMap;

public class FirstNonRepeated 
{
	public static void main(String[] args) 
	{
		System.out.println( firstNonRepeatedCharacter("teeter") );
	}
	
	public static Character firstNonRepeatedCharacter(String myString)
	{
		HashMap<Character,Integer> myHashMap = new HashMap<Character,Integer>();
		Character myChar;
		
		for(int i = 0; i<myString.length(); i++)
		{
			myChar = myString.charAt(i);
			if(myHashMap.containsKey(myChar))
			{
				myHashMap.put(myChar, myHashMap.get(myChar)+1 );
			}
			else 
			{
				myHashMap.put(myChar, 1);
			}
		}
		for(int i = 0; i<myString.length(); i++)
		{
			myChar = myString.charAt(i);
			if(myHashMap.get(myChar) == 1)
			{
				return myChar;
			}
		}
		return null;
	}
}
