package Test;

public class swapnumber
{
    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        a = a + b; // a  becomes 35 (15 + 20)
        b = a - b; // b  becomes 15 (35 - 20)
        a = a - b; // a  becomes 20 (35 - 15)
        System.out.println("After swapping: a = " + a + ", b = " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }



}

