package Test;

public class ResNumber
{
    public static void main(String[] args) {

        int x = 23062024; // This is the number we want to reverse.
        int y; // This variable will hold the last digit of 'x' in each iteration.
        int z = 0; // This will eventually become our reversed number.
                while(x>0)
                {
                    y=x%10;//The % operator gives us the remainder of x when divided by 10.
                    x=x/10;//The / operator divides x by 10, effectively removing the last digit.
                    System.out.println(y+" and "+x+" and "+z);
                    z=z*10+y;

                }
            System.out.println(z);


//        Detailed Example
//
//        Let's see how the variables change with each step when x = 23062024:
//
//        Initial values:
//        x = 23062024
//        z = 0
//
//        First iteration:
//        y = 23062024 % 10 = 4
//        x = 23062024 / 10 = 2306202
//        z = 0 * 10 + 4 = 4
//        Printed: 4 and 2306202 and 0
//
//        Second iteration:
//        y = 2306202 % 10 = 2
//        x = 2306202 / 10 = 230620
//        z = 4 * 10 + 2 = 42
//        Printed: 2 and 230620 and 4
//
//        Third iteration:
//        y = 230620 % 10 = 0
//        x = 230620 / 10 = 23062
//        z = 42 * 10 + 0 = 420
//        Printed: 0 and 23062 and 42
//
//        Fourth iteration:
//        y = 23062 % 10 = 2
//        x = 23062 / 10 = 2306
//        z = 420 * 10 + 2 = 4202
//        Printed: 2 and 2306 and 420
//
//        Fifth iteration:
//        y = 2306 % 10 = 6
//        x = 2306 / 10 = 230
//        z = 4202 * 10 + 6 = 42026
//        Printed: 6 and 230 and 4202
//
//        Sixth iteration:
//        y = 230 % 10 = 0
//        x = 230 / 10 = 23
//        z = 42026 * 10 + 0 = 420260
//        Printed: 0 and 23 and 42026
//
//        Seventh iteration:
//        y = 23 % 10 = 3
//        x = 23 / 10 = 2
//        z = 420260 * 10 + 3 = 4202603
//        Printed: 3 and 2 and 420260
//
//        Eighth iteration:
//        y = 2 % 10 = 2
//        x = 2 / 10 = 0
//        z = 4202603 * 10 + 2 = 42026032
//        Printed: 2 and 0 and 4202603
        }
}
