package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        String shopName;
        EnterData(prices);
        Price.Sort(prices);

        System.out.println("Enter name of shop which you are interested");
        Scanner in = new Scanner(System.in);
        shopName = in.nextLine();

        Price.Info(prices, shopName);
    }

    public static void EnterData(Price[] prices){
        Scanner in = new Scanner(System.in);
        String shopName, productName;
        double price;
        for (int i = 0; i < prices.length; i++){
            System.out.println("Enter shop name");
            shopName = in.nextLine();
            System.out.println("Enter name of product");
            productName = in.nextLine();
            System.out.println("Enter price for this product");
            price = in.nextDouble();
            in.nextLine();
            prices[i] = new Price(productName, price, shopName);
        }

    }
}
