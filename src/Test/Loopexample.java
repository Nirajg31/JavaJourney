package Test;

public class Loopexample
{
    public static void main(String[] args) {

        int x=24;
        int y=1;
        while(y<=10)
        {
            System.out.println(x +"*"+ y +"="+x*y);
            y=y+1;
        }

        System.out.println("End of while loops ");
        for (int i = 1; i<=10; i++)
        {
            System.out.println(x +"*"+ i +"="+x*i);
        }

        String []cars={"Volvo","BMW","Ford","NISAAN"};
        for(String i :cars){
            System.out.println(i);
        }
        System.out.println("Start of for each loops");
        for(String name :cars)
        {
            System.out.println(name);
        }
    //nested loop
        for(int a=21;a<=30;a++)
        {
            System.out.println("*********************Table of "+a+"***************** ");
            for(int b=1;b<=10;b++)
            {
                System.out.println(a+"*"+b+"="+a*b);
            }
        }

    }
}
