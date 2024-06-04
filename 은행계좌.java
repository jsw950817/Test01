public class BankAccount {
    String accountNumber;
    int balance;
    String owner;

    public BankAccount(String accountNumber , int balance, String owner) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;

    }
    void deposit(int 입금) {
        this.balance = this.balance + 입금;
    }
    void withdraw(int 출금) {
        this.balance = this.balance - 출금;
        System.out.println(this.balance);
    }

}
