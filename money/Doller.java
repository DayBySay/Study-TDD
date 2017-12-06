package money;

public class Doller extends Money{

    Doller(int amount) {
        this.amount = amount;
    }

    Doller times(int multiplier) {
        return new Doller(amount * multiplier);
    }
}
