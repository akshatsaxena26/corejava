package bank;

public class BankAccount {
    private long accountNumber;
    private String accountName;
    private double accountBalance;

    public BankAccount(long accountNumber, String accountName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public double getMoney(double money) {

        money -= accountBalance;

        return money;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (accountNumber ^ (accountNumber >>> 32));
        result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
        long temp;
        temp = Double.doubleToLongBits(accountBalance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankAccount other = (BankAccount) obj;
        if (accountNumber != other.accountNumber)
            return false;
        if (accountName == null) {
            if (other.accountName != null)
                return false;
        } else if (!accountName.equals(other.accountName))
            return false;
        if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
            return false;
        return true;
    }

    public double setMoney(double money) {

        if (money <= 0) {
            System.out.println("This is an invalid operation");
        } else {
            accountBalance += money;

        }

        return money;

    }
}
