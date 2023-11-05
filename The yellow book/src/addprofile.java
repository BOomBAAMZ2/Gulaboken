import java.util.Scanner;
import java.util.List;

public class addprofile {
    private List<profiles> allProfiles;

    public addprofile(List<profiles> allProfiles) {
        this.allProfiles = allProfiles;
    }


    public void addMenu() {

        Scanner addScan = new Scanner(System.in);

        while (true) {
            System.out.println("\033[36m1. Add a profile. \n2. Exit to admin menu." + "\033[0m");

            if (addScan.hasNextInt()) {
                int selection = addScan.nextInt();

                if (selection == 1) {

                    //Selection of "1"
                    System.out.println("Type in name");
                    String name = addScan.next();
                    System.out.println("Type in lastname");
                    String lastname = addScan.next();
                    System.out.println("Type in age");
                    if (!addScan.hasNextInt()) {
                        System.out.println("Invalid input, please use numbers");
                        System.out.println("Type in age");
                        addScan.next();
                    }
                    int age = addScan.nextInt();
                    if (age < 0 || age > 120) {
                        System.out.println("Invalid age");
                    }

                    System.out.println("Type in town");
                    String town = addScan.next();
                    System.out.println("Type in postcode");
                    int postcode = addScan.nextInt();
                    if (postcode < 10000 || postcode > 99999) {
                        System.out.println("Invalid postcode");
                        //Repeat the last code so the user can type in their postcode and try 1 more time
                        System.out.println("Type in postcode");
                        postcode = addScan.nextInt();
                        if (postcode < 10000 || postcode > 99999) {
                            System.out.println("Invalid postcode");
                            System.out.println("\033[31mYou only had 2 tries, restart the whole process" + "\033[0m");
                            continue;
                        }
                    }
                    System.out.println("Type in streetname(including number)");
                    String streetname = addScan.next();
                    int streetnumber = addScan.nextInt();
                    System.out.println("Type in phonenumber");
                    int phonenumber = addScan.nextInt();
                    System.out.println("Type in another phonenumber, write 0 for no number");
                    int phonenumber2 = addScan.nextInt();
                    System.out.println("\033[31mProfile has been added" + "\033[0m");

                    profiles newProfile = new profiles(name, lastname, age, town, postcode, streetname, streetnumber, phonenumber, phonenumber2);
                    allProfiles.add(newProfile);
                    //selection of "2"
                } else if (selection == 2) {
                    System.out.println("Exiting add profile");
                    adminmenu.menuAdmin(allProfiles);
                }
                //Anything else than numbers
            } else {
                System.out.println("Invalid input, please select a number");
                addScan.next();
            }

        }

    }
}
