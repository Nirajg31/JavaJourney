package Oops;

public class StaticExample {

    public String name;
    public int rollNo;
    public static String institute = "Oxford";
    public StaticExample(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
    public static void displayInst()
    {
        System.out.println(institute);
    }
    public void displayStudentDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}