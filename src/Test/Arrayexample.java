package Test;

public class Arrayexample
{
    public static void main(String[] args)
    {
        int [] num={3,6,7,8,3,7,2,1};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num.length);
        System.out.println(num.length-1);
        String []name= {"John","Adam","Eva","Nancy"};
        char[] vowels={'a','e','i','o','u'};
        String fname = "amandeep";
        char[] ch = fname.toCharArray();
        System.out.println(ch[0]);

        String str1 = "my name is nik";
        String [] words = str1.split(" ");
        System.out.println("First word is " + words[0]);
        System.out.println("Second word is " + words[1]);


    }
}
