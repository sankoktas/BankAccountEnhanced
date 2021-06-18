public class BankAccount 
{
    private double balance;
    private double feeCharge = 3.00; 
    private int noOfWithdrawals = 0;
    private int tresholdOfWithdrawals = 5;

    public BankAccount()
    {
        balance = 0;
    }

    public double getBalance()
    {
        return balance;
    }

    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }

    public void deposit(double amount)
    {
        balance = balance + amount - feeCharge;
    }

    public void withdraw(double amount)
    {
        balance = balance - amount - feeCharge;
        noOfWithdrawals++;
    }

    public void deductMonthlyCharge()
    {
        if (noOfWithdrawals > tresholdOfWithdrawals) 
        {
            balance = balance - feeCharge * (noOfWithdrawals - tresholdOfWithdrawals);
        }
        else 
        {
            balance = balance;
        }
    }
}
