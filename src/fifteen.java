import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class fifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int powderNum = Integer.parseInt(scanner.nextLine());
        int lipstickNum = Integer.parseInt(scanner.nextLine());
        int spiralNum = Integer.parseInt(scanner.nextLine());
        int shadowsNum = Integer.parseInt(scanner.nextLine());
        int concealerNum = Integer.parseInt(scanner.nextLine());

        double powder = 2.60;
        double lipstick = 3;
        double spiral = 4.10;
        double shadows = 8.20;
        double concealer = 2;

        double amount = powderNum * powder + lipstickNum * lipstick + spiralNum * spiral + shadowsNum * shadows + concealerNum * concealer;

        int numOfMakeUp = powderNum + lipstickNum + spiralNum + shadowsNum + concealerNum;
        if(numOfMakeUp > 50){
            amount = amount * 0.75;
        }

        amount = amount * 0.90;

        if(amount > price) {
            amount = amount - price;
            System.out.printf("Yes! %.2f lv left.", amount);
        }else {
            amount = price - amount;
            System.out.printf("Not enough money! %.2f lv needed.", amount);
        }

     }
}
