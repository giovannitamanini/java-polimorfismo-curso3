public class CurrentAccount extends Account {

    public CurrentAccount(int branch, int number) {
        super(branch, number);
    }

    @Override
    public boolean withdraw(double value) {
        double withdrawValue = value + 0.2;
        return super.withdraw(withdrawValue);
    }
}
