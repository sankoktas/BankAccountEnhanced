public class BankAccountTester 
{
    public static void main(String[] args) 
    {
        BankAccount myBalance = new BankAccount();
        myBalance.deposit(100);
        System.out.println(myBalance.getBalance());
        
        myBalance.withdraw(20);
        myBalance.deductMonthlyCharge();
        System.out.println(myBalance.getBalance());
        
        myBalance.withdraw(2);
        myBalance.withdraw(2);
        myBalance.withdraw(2);
        myBalance.withdraw(2);
        myBalance.withdraw(2);
        myBalance.deductMonthlyCharge();
        System.out.println(myBalance.getBalance());
    }
}
