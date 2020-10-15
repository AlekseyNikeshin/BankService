public class Cashback {
    public double calculate(int percent, int expenses) {
        double cashback = percent * expenses / 100.0;
        return cashback;

    }
}
