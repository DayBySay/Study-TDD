package money;

public class Doller {
    int amount;

    Doller(int amount) {
        this.amount = amount;
    }

    Doller times(int multiplier) {
        return new Doller(amount * multiplier);
    }

    public boolean equals(Object object) {
        Doller dollar = (Doller)object;
        return amount == dollar.amount;
    }
}
