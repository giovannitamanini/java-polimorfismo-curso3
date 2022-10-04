public class Account {
    private double balance;
    private int branch;
    private int number;
    private Client holder;
    private static int total = 0;

    public Account(int branch, int number) {
        Account.total++;
        //System.out.println("The total of account is " + Account.total);
        this.branch = branch;
        this.number = number;
        //this.balance = 100;
        //System.out.println("I'm creating an account " + this.number + " in the branch " + this.branch);
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdraw(double value) {
        if(this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destiny) {
        if(this.withdraw(value)) {
            destiny.deposit(value);
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public int getBranch() {
        return this.branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Client getHolder() {
        return this.holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }
}
