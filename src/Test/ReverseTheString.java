package Test;

public class ReverseTheString

{
    public static void main(String[] args) {
        String str1="Hello World";
        String reverse="";
        for(int i=str1.length()-1;i >= 0;i--)
        {
            reverse+=str1.charAt(i);

            System.out.println("Character at index " + i + ": " + str1.charAt(i));
            System.out.println("Intermediate reversedString: " + reverse);
        }
    }
}
