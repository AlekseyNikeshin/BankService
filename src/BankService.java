public class BankService {
    double calculate(int percent, int sum) {
        double deposit = percent * sum / 100.0;
        return deposit;
    }

    double earn(int cashbackPercent, int expenses) {
        double cashback = cashbackPercent * expenses / 100.0;
        return cashback;
    }
}
