public class AccountsTest {

    public static void main(String[] args) {
        CurrentAccount currentAccount1 = new CurrentAccount(111, 111);
        currentAccount1.deposit(100.0);

        SavingsAccount savingsAccount1 = new SavingsAccount(222, 222);
        savingsAccount1.deposit(200.0);

        currentAccount1.transfer(10.0, savingsAccount1);

        System.out.println("Current account balance: " + currentAccount1.getBalance());
        System.out.println("Savings account balance: " + savingsAccount1.getBalance());
    }
}
