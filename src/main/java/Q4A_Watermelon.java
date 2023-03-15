import java.util.Scanner;

/**
 * @author Luthfi
 * @since 1.0.0
 */
public class Q4A_Watermelon {

    private static boolean isValidWatermelon(int w) {

        return (w % 2 == 0) && (w / 2 % 2 == 0);
    }

    public static String isValidWatermelonToFormattedString(int w) {

        return String.format(isValidWatermelon(w) ? "YES" : "NO");
    }

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final int w = scanner.nextInt();

        System.out.println(isValidWatermelonToFormattedString(w));
    }
}
