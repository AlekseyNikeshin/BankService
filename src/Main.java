public class Main {
    public static void main(String[] args) {
        BankService  service = new BankService();
        double deposit = service.calculate(5,30000);
        System.out.println(deposit);
        double cashback = service.earn(3, 10000);
        System.out.println(cashback);

    }
}