package Oops;

public class ReverseString
{
    String result="";
    public String Reversemethod(String str1)
    {
        for(int i=str1.length()-1;i>=0;i--)
        {
            result+=str1.charAt(i);

        }
        return result;

    }
}
