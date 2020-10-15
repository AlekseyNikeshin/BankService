public class Main {
    public static void main(String[] args) {
        {
            Deposit service;
            service = new Deposit();
            double total = service.calculate(5, 3000);
            System.out.println(total);
        }


        {
            Cashback service;
            service = new Cashback();
            double cashback = service.calculate(5, 30000);
            System.out.println(cashback);

        }
    }
}