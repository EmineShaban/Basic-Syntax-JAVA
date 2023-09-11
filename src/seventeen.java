import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        if(a > 90 && a< 100){
            System.out.println("A");
        }else if(a > 80 && a< 89){
            System.out.println("B");
        }else if(a > 70 && a< 79){
            System.out.println("C");
        }else if(a > 60 && a< 69){
            System.out.println("D");
        }else {
            System.out.println("F");
        }


    }
}
