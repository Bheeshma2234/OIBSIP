import java.util.ArrayList;
import java.util.Scanner;

public class ATM {

    private Account currentAccount;
    private Bank bank;
    private Scanner scanner;
    private ArrayList<Transaction> transactions;

    public ATM(Account currentAccount, Bank bank, Scanner scanner) {

        this.currentAccount = currentAccount;
        this.bank = bank;
        this.scanner = scanner;
        this.transactions = new ArrayList<>();
    }

    public void start() {

        boolean running = true;

        while (running) {

            displayMenu();

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    showTransactionHistory();
                    break;

                case "2":
                    withdraw();
                    break;

                case "3":
                    deposit();
                    break;

                case "4":
                    transfer();
                    break;

                case "5":
                    System.out.println();
                    System.out.println("Thank you for using the ATM.");
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println();
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMenu() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("              ATM MENU");
        System.out.println("========================================");
        System.out.println("Welcome, " + currentAccount.getAccountHolderName());
        System.out.printf("Available Balance: Rs. %.2f%n",
                currentAccount.getBalance());
        System.out.println("----------------------------------------");
        System.out.println("1. Transaction History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
        System.out.println("========================================");
    }

    private void showTransactionHistory() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("         TRANSACTION HISTORY");
        System.out.println("========================================");

        if (transactions.isEmpty()) {

            System.out.println("No transactions available.");

        } else {

            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }

        System.out.println("========================================");
    }

    private void withdraw() {

        System.out.println();
        System.out.println("----------- WITHDRAW -----------");

        double amount = readAmount("Enter withdrawal amount: ");

        if (amount <= 0) {
            System.out.println("Invalid amount.");
            return;
        }

        if (amount > currentAccount.getBalance()) {

            System.out.println("Insufficient Funds.");
            return;
        }

        if (currentAccount.withdraw(amount)) {

            transactions.add(
                    new Transaction(
                            "WITHDRAW",
                            amount,
                            "Cash withdrawal"
                    )
            );

            System.out.printf(
                    "Withdrawal successful. Amount: Rs. %.2f%n",
                    amount
            );

            System.out.printf(
                    "Remaining Balance: Rs. %.2f%n",
                    currentAccount.getBalance()
            );
        }
    }

    private void deposit() {

        System.out.println();
        System.out.println("----------- DEPOSIT -----------");

        double amount = readAmount("Enter deposit amount: ");

        if (amount <= 0) {

            System.out.println("Invalid amount.");
            return;
        }

        currentAccount.deposit(amount);

        transactions.add(
                new Transaction(
                        "DEPOSIT",
                        amount,
                        "Cash deposit"
                )
        );

        System.out.printf(
                "Deposit successful. Amount: Rs. %.2f%n",
                amount
        );

        System.out.printf(
                "Updated Balance: Rs. %.2f%n",
                currentAccount.getBalance()
        );
    }

    private void transfer() {

        System.out.println();
        System.out.println("----------- TRANSFER -----------");

        System.out.print("Enter recipient User ID: ");
        String recipientId = scanner.nextLine();

        Account recipient = bank.findAccount(recipientId);

        if (recipient == null) {

            System.out.println("Recipient account not found.");
            return;
        }

        if (recipient.getUserId().equals(currentAccount.getUserId())) {

            System.out.println("You cannot transfer money to yourself.");
            return;
        }

        double amount = readAmount("Enter transfer amount: ");

        if (amount <= 0) {

            System.out.println("Invalid amount.");
            return;
        }

        if (amount > currentAccount.getBalance()) {

            System.out.println("Insufficient Funds.");
            return;
        }

        currentAccount.withdraw(amount);
        recipient.deposit(amount);

        transactions.add(
                new Transaction(
                        "TRANSFER",
                        amount,
                        "Transferred to " + recipient.getUserId()
                )
        );

        System.out.printf(
                "Transfer successful. Amount: Rs. %.2f%n",
                amount
        );

        System.out.println(
                "Recipient: " + recipient.getAccountHolderName()
        );

        System.out.printf(
                "Remaining Balance: Rs. %.2f%n",
                currentAccount.getBalance()
        );
    }

    private double readAmount(String message) {

        while (true) {

            System.out.print(message);

            try {

                double amount =
                        Double.parseDouble(scanner.nextLine());

                return amount;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Please enter a valid numeric amount."
                );
            }
        }
    }
}
