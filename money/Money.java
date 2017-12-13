package money;

public abstract class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static public Doller dollar(int amount) {
        return new Doller(amount);
    }

    static public Franc franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);
}
