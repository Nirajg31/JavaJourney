package Oops;

public class Bankaccount
{
    private String accountnumner;
    private double Balance;
    public Bankaccount()
    {
        this.accountnumner="0007";
        this.Balance=0.0;

    }
    public  Bankaccount(String accountnumner,double Balance)
    {
        this.Balance=Balance;
        this.accountnumner=accountnumner;
    }
    public void Display()
    {
        System.out.println("Account Number: " + accountnumner);
        System.out.println("Balance: $" + Balance);
    }
}
