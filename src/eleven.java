import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        if(a != 0 && a<100 && a> -100){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
