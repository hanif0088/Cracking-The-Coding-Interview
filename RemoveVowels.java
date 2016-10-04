public class RemoveVowels 
{
    public static void main(String[] args) 
    {
        String str = "RemoveVowels";
        String output = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(output);
    }
}
