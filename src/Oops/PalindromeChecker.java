package Oops;

public class PalindromeChecker {
    public boolean isPalindrome(String str1)
    {
        String str2 = "";

        for(int i = str1.length() - 1; i >= 0; i--)
        {
            str2 += str1.charAt(i);
        }
        return str1.equalsIgnoreCase(str2);
    }

    public boolean PalindromeChecke1(String text)
    {

        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
    public boolean checkwithpointer(String strA)
    {
        int left=0;
        int right= strA.length()-1;
        while(left<right)
        {
            if (strA.charAt(left)!=strA.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}

