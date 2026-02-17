/**
 * OOPSBannerApp
 *
 * UC4: Display "OOPS" banner using array and loop for better modularity.
 *
 * @author Vansh
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join(" ", "*****", "*****", "*****", "*****"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*   *", "*   *", "*   *", "*   *"),
                String.join(" ", "*****", "*****", "*****", "*****")
        };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
