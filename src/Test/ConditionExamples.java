package Test;

public class ConditionExamples
{
    public static void main(String[] args) {

        int x = 100;
        int y = 50;
        if (x == y)
        {
            System.out.println("Both numbers are equals");
        } else if (x > y) {
            System.out.println(x + "greater than " + y);

        }
        else
        {
            System.out.println(y+"is greater than"+x);

        }
        String str1="Vibha";
        String str2="vibha";
        if (str1.equalsIgnoreCase(str2))
        {
            System.out.println("str1 is equal to str2");
        }
        else{
            System.out.println("Both string are not equals");
        }

    }
}
