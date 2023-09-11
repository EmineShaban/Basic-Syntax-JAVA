import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        String city = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double res = 0;
        if(city.equals("Saturday") || city.equals("Sunday")){
            if(day.equals("tomato")){
                res = quantity * 2.80;
                System.out.println(res);

            }else if(day.equals("onion")){
                res = quantity * 1.30;
                System.out.println(res);

            }else if(day.equals("lettuce")){
                res = quantity * 0.85;
                System.out.println(res);

            }else if(day.equals("cucumber")){
                res = quantity * 1.75;
                System.out.println(res);

            }else if(day.equals("pepper")){
                res = quantity * 3.50;
                System.out.println(res);

            }else {
                System.out.println("error");
            }

        }else if(city.equals("Monday") || city.equals("Tuesday") || city.equals("Wednesday") || city.equals("Thursday") || city.equals("Friday")){


            if(day.equals("tomato")){
                res = quantity * 2.50;
                System.out.println(res);

            }else if(day.equals("onion")){
                res = quantity * 1.20;
                System.out.println(res);

            }else if(day.equals("lettuce")){
                res = quantity * 0.85;
                System.out.println(res);

            }else if(day.equals("cucumber")){
                res = quantity * 1.45;
                System.out.println(res);

            }else if(day.equals("pepper")){
                res = quantity * 5.50;
                System.out.println(res);

            }else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }





    }
}
