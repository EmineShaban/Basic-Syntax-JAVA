import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        if(a <= 10){
            System.out.println("slow");
        }else if(a < 60){
            System.out.println("average");
        }else if(a < 120){
            System.out.println("fast");
        }else if(a < 160){
            System.out.println("super-fast");
        }else {
            System.out.println("turbo-fast");
        }


    }
}
