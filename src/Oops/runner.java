package Oops;

public class runner
{
    public static void main(String[] args) {
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        emp1.name="Niraj";
        emp1.empid=1000;
        emp1.salary=5000;

        emp2.name="Chandra";
        emp2.empid=2000;
        emp2.salary=3000;
emp1.display();
emp2.display();
ReverseString res=new ReverseString();
String text=res.Reversemethod("Niraj");

        System.out.println(text);

        String testString="LEvel";
        PalindromeChecker checker = new PalindromeChecker();
      boolean result=  checker.isPalindrome(testString);
        System.out.println("1.)Is \"" + testString + "\" a palindrome? " + result);

        String teststring1="MADAM";
       boolean result1= checker.PalindromeChecke1(teststring1);
        System.out.println("2.)Is \"" + teststring1 + "\" a palindrome? " + result1);

        String teststring2="NANA";

        boolean result2=checker.checkwithpointer(teststring2);

        System.out.println("2.)Is \"" + teststring2 + "\" a palindrome? " + result2);


        Bankaccount bankaccount1= new Bankaccount();
        bankaccount1.Display();
        Bankaccount bankaccount2= new Bankaccount("123456", 1000.0);
        bankaccount2.Display();



        StaticExample student1 = new StaticExample("Alice", 1);
        StaticExample student2 = new StaticExample("Bob", 2);

        StaticExample.displayInst();
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        StaticExample.institute = "Cambridge";
        StaticExample.displayInst();

        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }

}
