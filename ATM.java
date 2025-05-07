package ATMInterface;

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\nWelcome To The ATM!");
        System.out.println("1) Check Balance");
        System.out.println("2) Deposit Money");
        System.out.println("3) Withdraw Money");
        System.out.println("4) Exit");
        System.out.print("Choose one of the above options: ");
    }

    public void checkBalance() {
        System.out.printf("Your current balance is:  %.2f\n", account.getBalance());
    }

    public void deposit(double amount) {
        if (account.deposit(amount)) {
            System.out.printf("Successfully deposited  %.2f\n", amount);
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    public void withdraw(double amount) {
        if (account.withdraw(amount)) {
            System.out.printf("Successfully withdrew  %.2f\n", amount);
        } else {
            System.out.println("Withdrawal failed. Please check your balance or enter a valid amount.");
        }
    }
}
