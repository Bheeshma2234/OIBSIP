import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println();
        System.out.println("========================================");
        System.out.println("          WELCOME TO ATM");
        System.out.println("========================================");

        Account account = null;

        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        while (attempts < MAX_ATTEMPTS) {

            System.out.print("Enter User ID: ");
            String userId = scanner.nextLine();

            System.out.print("Enter PIN: ");
            String pin = scanner.nextLine();

            account = bank.authenticate(userId, pin);

            if (account != null) {

                System.out.println();
                System.out.println("Login successful!");
                System.out.println(
                        "Welcome, " + account.getAccountHolderName()
                );

                break;

            } else {

                attempts++;

                System.out.println();
                System.out.println(
                        "Invalid User ID or PIN."
                );

                if (attempts < MAX_ATTEMPTS) {

                    System.out.println(
                            "Attempts remaining: "
                                    + (MAX_ATTEMPTS - attempts)
                    );
                }
            }
        }

        if (account == null) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("          ACCESS DENIED");
            System.out.println("Maximum login attempts exceeded.");
            System.out.println("Please try again later.");
            System.out.println("========================================");

            scanner.close();
            return;
        }

        ATM atm = new ATM(account, bank, scanner);
        atm.start();

        scanner.close();
    }
}
