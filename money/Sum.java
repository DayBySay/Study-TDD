package money;

public class Sum implements Expression {
    Expression augend;
    Expression addend;

    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
        return  new Money(amount, to);
    }

    @Override
    public Expression plus(Expression added) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiPlier) {
        return new Sum(augend.times(multiPlier), addend.times(multiPlier));
    }
}
