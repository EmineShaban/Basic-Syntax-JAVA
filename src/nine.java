import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);

        if(gender =='m' && age > 16){
            System.out.println("Mr.");
        }else if(gender =='m' && age < 16){
            System.out.println("Master");
        }else if(gender =='f' && age > 16){
            System.out.println("Ms.");
        }else if(gender =='f' && age < 16){
            System.out.println("Miss");
        }



    }
}
