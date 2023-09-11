import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mark = Double.parseDouble(scanner.nextLine());
        if(mark >= 5.50){
            System.out.println("Excellent!");
        }else {
            System.out.println("no output");

        }

    }
}