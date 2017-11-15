package money;

public class Doller {
    int amount;

    Doller(int amount) {
    this.amount = amount;
    }

    void times(int multiplier) {
        amount = amount *= multiplier;
    }
}
