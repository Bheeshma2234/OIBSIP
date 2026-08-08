import java.util.Scanner;

public class OnlineReservationSystem {

    static Scanner scanner = new Scanner(System.in);

    static String passengerName;
    static int age;
    static String gender;
    static String source;
    static String destination;
    static boolean reserved = false;

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("      ONLINE RESERVATION SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (!username.equals("admin") || !password.equals("admin")) {
            System.out.println("Invalid login details.");
            return;
        }

        System.out.println("\nLogin successful!");

        while (true) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Reserve Ticket");
            System.out.println("2. View Reservation");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");
            System.out.println("==========================");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    reserveTicket();
                    break;

                case 2:
                    viewReservation();
                    break;

                case 3:
                    cancelReservation();
                    break;

                case 4:
                    System.out.println("Thank you for using the system.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void reserveTicket() {

        if (reserved) {
            System.out.println("A reservation already exists.");
            return;
        }

        System.out.println("\n----- Ticket Reservation -----");

        System.out.print("Enter Passenger Name: ");
        passengerName = scanner.nextLine();

        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Gender: ");
        gender = scanner.nextLine();

        System.out.print("Enter Source: ");
        source = scanner.nextLine();

        System.out.print("Enter Destination: ");
        destination = scanner.nextLine();

        reserved = true;

        System.out.println("\nTicket reserved successfully!");
    }

    static void viewReservation() {

        if (!reserved) {
            System.out.println("No reservation found.");
            return;
        }

        System.out.println("\n----- Reservation Details -----");
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Age            : " + age);
        System.out.println("Gender         : " + gender);
        System.out.println("Source         : " + source);
        System.out.println("Destination    : " + destination);
    }

    static void cancelReservation() {

        if (!reserved) {
            System.out.println("No reservation found.");
            return;
        }

        reserved = false;

        System.out.println("Reservation cancelled successfully.");
    }
}
