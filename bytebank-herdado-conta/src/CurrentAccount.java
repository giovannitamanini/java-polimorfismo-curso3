public class CurrentAccount extends Account {

    public CurrentAccount(int branch, int number) {
        super(branch, number);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }

    @Override
    public boolean withdraw(double value) {
        double withdrawValue = value + 0.2;
        return super.withdraw(withdrawValue);
    }
}
