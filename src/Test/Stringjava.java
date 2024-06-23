package Test;

public class Stringjava
{
    public static void main(String[] args)
    {
        System.out.println("Hello java");
        String greeting = "Hello Alan";//to store the value into string datatype
        System.out.println(greeting);
        String strlen="ASDASDQWRARQWRSFAFQWTRQWERqwr";
        System.out.println(strlen.length());//find the length of the string
        String tx="Hello wrold";
        System.out.println(tx.toLowerCase());//convert the string into upper case
        System.out.println(tx.toUpperCase());//convert the string into lower case
        String txt = "Please locate where nik 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));

        String firstname="Alan";
        String lastname="Sugae";
        System.out.println(firstname.concat(lastname));
        String fullname=firstname+" "+lastname;
        System.out.println(fullname.length());
        System.out.println(firstname+lastname);
        System.out.println(firstname.charAt(2));
        System.out.println(fullname.charAt(fullname.length()-1));

        String str = "Hello, world!";
        String substr = str.substring(7, 13);
        System.out.println("Substring: " + substr);

        String newnamevar="Parkar";
        String newName=fullname.replace(lastname,newnamevar);
        System.out.println(newName);
        boolean checknewname= newName.contains(newnamevar);
        System.out.println(checknewname);

        char c='A';
        System.out.println(newName.indexOf("parkar"));

        String str1="Hello";
        String str2="Hello";
        String str3="hello";
        boolean eq1=str1.equals(str2);
        System.out.println(eq1);
        boolean eq2=str1.equals(str3);
        System.out.println(eq2);
        boolean eq3=str1.equalsIgnoreCase(str3);
        System.out.println(eq3);

        String splitWord="Hello ,World";
        String[] afterSplit= splitWord.split(",");
        System.out.println("First Value "+" "+afterSplit[0]);
        System.out.println("Second Value "+" "+afterSplit[1]);
        System.out.println("test");












    }
}
