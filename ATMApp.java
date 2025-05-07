package ATMInterface;
import java.util.*;

public class ATMApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(1000.00);
        ATM atm = new ATM(userAccount);

        boolean running = true;

        while (running) {
            atm.displayMenu();
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    atm.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please choose Valid Options.");
            }
        }
    }
}
