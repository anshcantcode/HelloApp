/**
 * OOPSBannerApp
 *
 * UC6: Display "OOPS" banner using static helper methods.
 *
 * @author Vansh
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[][] letters = {
                buildO(),
                buildO(),
                buildP(),
                buildS()
        };

        // Combine letters row by row
        for (int row = 0; row < 7; row++) {
            String line = String.join(" ",
                    letters[0][row],
                    letters[1][row],
                    letters[2][row],
                    letters[3][row]);
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] buildO() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        };
    }

    // Helper method for letter P
    public static String[] buildP() {
        return new String[]{
                "*****",
                "*   *",
                "*   *",
                "*****",
                "*",
                "*",
                "*"
        };
    }

    // Helper method for letter S
    public static String[] buildS() {
        return new String[]{
                "*****",
                "*",
                "*",
                "*****",
                "    *",
                "    *",
                "*****"
        };
    }
}