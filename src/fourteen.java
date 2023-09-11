import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String typeOfHoliday = "";

        String destination = "";
        double res = 0;
        if(budget <= 100){
            destination = "Bulgaria";
        }else if(budget <= 1000){
            destination = "Europe";
        }else if(budget > 1000){
            destination = "Asia";
        }

        if (destination.equals("Asia")) {
            typeOfHoliday = "Hotel";
        } else if (season.equals("summer")){
            typeOfHoliday = "Camp";
        } else if (season.equals("winter")) {
            typeOfHoliday = "Hotel";
        }

        if(destination.equals("Bulgaria") && season.equals("summer")){
            res = budget * 0.3;
        }else  if(destination.equals("Bulgaria") && season.equals("winter")) {
            res = budget * 0.7;
        }else if(destination.equals("Europe") && season.equals("summer")){
            res = budget * 0.4;
        }else  if(destination.equals("Europe") && season.equals("winter")) {
            res = budget * 0.8;
        }else{
            res = budget * 0.9;
        }
        System.out.printf("Somewhere in " + destination + "%n");

        System.out.printf("%s - %.2f", typeOfHoliday, res);
    }
}
