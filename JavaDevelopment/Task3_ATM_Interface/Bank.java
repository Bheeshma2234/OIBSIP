import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();

        accounts.add(
                new Account(
                        "user001",
                        "1234",
                        "Bheeshma Shankar",
                        10000.00
                )
        );

        accounts.add(
                new Account(
                        "user002",
                        "5678",
                        "Rahul Kumar",
                        8000.00
                )
        );

        accounts.add(
                new Account(
                        "user003",
                        "4321",
                        "Priya Sharma",
                        12000.00
                )
        );
    }

    public Account authenticate(String userId, String pin) {

        for (Account account : accounts) {

            if (account.getUserId().equals(userId)
                    && account.getPin().equals(pin)) {

                return account;
            }
        }

        return null;
    }

    public Account findAccount(String userId) {

        for (Account account : accounts) {

            if (account.getUserId().equals(userId)) {
                return account;
            }
        }

        return null;
    }
}
