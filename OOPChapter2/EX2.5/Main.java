public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(161006, "Ken", 'm');
        Account account = new Account(160660, customer, 500.0 );

        System.out.println(account);

        account.deposit(500.0);
        System.out.println(account);

        account.withdraw(100.0);
        System.out.println(account);

        account.withdraw(1000.0);
        System.out.println(account);
    }
}