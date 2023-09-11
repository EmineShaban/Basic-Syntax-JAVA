import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        if((min + 15) <= 59){
            min = min + 15;
        } else if ((min + 15) > 59) {
            min = min + 15 -60;
            hours = hours+1;
        }

        if(hours > 23){
            hours = 0;
        }

        if(min < 10){
            System.out.println(hours + ":0" + min);

        }else {
            System.out.println(hours + ":" + min);

        }


    }
}
