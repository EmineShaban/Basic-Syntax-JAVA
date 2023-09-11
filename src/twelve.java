import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class twelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        if(operation.equals("add")){
            System.out.println(a + b);
        }else if(operation.equals("subtract")){
            System.out.println(a - b);
        }else if(operation.equals("multiply")){
            System.out.println(a * b);
        }else if(operation.equals("divide")){
            System.out.println(a / b);
        }


    }
}
