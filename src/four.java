import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if(figure.equals("square")){
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println(num * num);
        }else if(figure.equals("rectangle")){
            int num1 = Integer.parseInt(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.println(num1 * num2);
        }else if(figure.equals("triangle")){
            double num1 = Double.parseDouble(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.println(0.5 * num1 * num2);
        }else if(figure.equals("circle")){
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println(Math.PI * num * num);
        }


    }
}