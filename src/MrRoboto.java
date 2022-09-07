// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     *
     * Shawn Chappelle 9/17/2022
     *
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        // Write your program here
        String humanInput = scanner.nextLine();
        System.out.print(domo);
        System.out.print(humanInput);
    }
}
