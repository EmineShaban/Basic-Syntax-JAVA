import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class eighteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Integer.parseInt(scanner.nextLine());

        if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
           System.out.println("It‘s a leap year!");
        } else {
            System.out.println("It‘s not a leap year.");

        }



    }
}
