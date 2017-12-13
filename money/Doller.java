package money;

public class Doller extends Money{

    Doller(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Doller(amount * multiplier);
    }
}
