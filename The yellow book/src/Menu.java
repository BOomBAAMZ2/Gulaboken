import java.util.Scanner;
import java.util.List;
public class Menu {

    // The Super Menu, startup.
    public static void superMenu(List<profiles> allProfiles) {
        System.out.println("\033[33mBurning up all books that isn't yellow...." + "\033[0m");
        performDelay(2000);
        System.out.println("\033[31m");
        System.out.println("All books are burned up.");
        System.out.println("Please make a choice below" + "\033[0m");

        Scanner menuScan = new Scanner(System.in);

        // Selection for user between 1 or 2.
        while (true) {
            System.out.println("1. Login using username & password. \n2. Exit the mighty yellow book \n");

            if (menuScan.hasNextInt()) {


                int selection = menuScan.nextInt();

                if (selection == 1) {

                    // Selection of "1"
                    System.out.println("\033[34m");
                    System.out.println("You selected 'Login' ");
                    System.out.println("Please type your username");
                    Scanner userScan = new Scanner(System.in);
                    String userText = userScan.nextLine();
                    // If admin, forward to adminMenu
                    if (userText.equals("Admin")) {
                        System.out.println("Type in your password" + "\033[0m");
                        Scanner passScan = new Scanner(System.in);
                        String passText = passScan.nextLine();
                        // Admin password
                        if (passText.equals("Admin123")) {
                            System.out.println("\033[32mLogin Succeed" + "\033[0m");
                            adminmenu.menuAdmin(allProfiles);
                        } else {
                            System.out.println("\033[34mWrong password" + "\033[0m");
                            continue;
                        }
                        // If guest, forward to guestMenu
                    } else if (userText.equals("Guest")) {
                            System.out.println("\033[32mLogin Succeed for guest" + "\033[0m");
                            guestmenu.menuGuest(allProfiles);

                        // Wrong username, continue
                    } else {
                        System.out.println("Username does not exist");
                        continue;
                    }

                    break;

                    // Selection of 2 exits yellow book
                } else if (selection == 2) {
                    System.out.println("Exiting the mighty yellow book...");
                    System.exit(0);

                    // If not 1 or 2 = Invalid selection, only works for numbers
                } else {
                    System.out.println("Invalid selection, please try again");
                }
                // If input letters = deny
            } else {
                System.out.println("Invalid input, please enter a number");
                menuScan.next();
            }

        }


    }
    // Funny delay moment when opening menu
    public static void performDelay(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
