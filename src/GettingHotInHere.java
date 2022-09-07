import java.util.Scanner;

public class GettingHotInHere {
    /**
     *
     * Shawn Chappelle 9/7/2022
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/


    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit-32)*(5.0/9.0);

        System.out.print(fahrenheit);
        System.out.println("°F");
        System.out.print(celsius);
        System.out.println("°C");
        System.out.print((int) celsius);
        System.out.println("°C");
        System.out.print("If it were 2°C warmer it would be: ");
        System.out.print(celsius+2);
        System.out.print("°C");

    }
}
