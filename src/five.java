import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        if(a == 1){
            System.out.println("Monday");
        }else if(a == 2){
            System.out.println("Tuesday");
        }else if(a == 3){
            System.out.println("Wednesday");
        }else if(a == 4){
            System.out.println("Thursday");
        }else if(a == 5){
            System.out.println("Friday");
        }else if(a == 6){
            System.out.println("Saturday");
        }else if(a == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Error");
        }

    }
}
