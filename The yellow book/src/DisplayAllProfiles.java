import java.util.List;
public class DisplayAllProfiles {

    public static void displayProfiles(List<profiles> allProfiles) {
        for (profiles profile : allProfiles) {
            System.out.println("\033[36mName: " + "\033[0m" + profile.getName());
            System.out.println("\033[36mLastname: " + "\033[0m" + profile.getLastname());
            System.out.println("\033[36mAge: " + "\033[0m" + profile.getAge());
            System.out.println("\033[36mTown: " + "\033[0m" + profile.getTown());
            System.out.println("\033[36mPostcode: " + "\033[0m" + profile.getPostcode());
            System.out.println("\033[36mStreetname: " + "\033[0m" + profile.getStreetname() + " " + profile.getStreetnumber());
            System.out.println("\033[36mPhonenumber: " + "\033[0m" + profile.getPhonenumber());
            if (profile.getPhonenumber2() == 0) {
                continue;
            } else {
                System.out.println("\033[32mPhonenumber 2: " + profile.getPhonenumber2() + "\033[0m");
            }
            System.out.println("");
        }
    }
}
