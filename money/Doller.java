package money;

public class Doller {
    int amount;

    Doller(int amount) {
        this.amount = amount;
    }

    Doller times(int multiplier) {
        return new Doller(amount * multiplier);
    }
}
