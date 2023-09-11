import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double res = 0;
        if(city.equals("Sofia")){
            if(product.equals("coffee")){
                res = quantity * 0.50;
            }else if(product.equals("water")){
                res = quantity * 0.80;
            }else if(product.equals("juice")){
                res = quantity * 1.20;
            }else if(product.equals("sweets")){
                res = quantity * 1.45;
            }else if(product.equals("chips")){
                res = quantity * 1.60;
            }
        }else if(city.equals("Plovdiv")){
            if(product.equals("coffee")){
                res = quantity * 0.40;
            }else if(product.equals("water")){
                res = quantity * 0.70;
            }else if(product.equals("juice")){
                res = quantity * 1.15;
            }else if(product.equals("sweets")){
                res = quantity * 1.30;
            }else if(product.equals("chips")){
                res = quantity * 1.50;
            }
        }else if(city.equals("Varna")){
            if(product.equals("coffee")){
                res = quantity * 0.45;
            }else if(product.equals("water")){
                res = quantity * 0.70;
            }else if(product.equals("juice")){
                res = quantity * 1.10;
            }else if(product.equals("sweets")){
                res = quantity * 1.35;
            }else if(product.equals("chips")){
                res = quantity * 1.55;
            }
        }

        System.out.println(res);




    }
}
