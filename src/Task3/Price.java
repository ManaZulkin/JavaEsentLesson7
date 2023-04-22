package Task3;

import java.util.Arrays;
import java.util.Comparator;

public class Price {
    String shopName, productName;
    double price;

    public Price(String productName, double price, String shopName){
        this.price = price;
        this.productName = productName;
        this.shopName = shopName;
    }

    public static void Sort(Price[] prices){
        Arrays.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.shopName.compareTo(o2.shopName);
            }
        });
    }

    public static void Info(Price[] prices, String shopName){
        try{
            Exception wrongShop = new Exception("We don't have data about this shop");
            for (int i = 0; i <= prices.length; i++){
                if (i < prices.length){
                    if(prices[i].shopName.equals(shopName)) {
                        System.out.println(shopName + " : " + prices[i].productName + " - $" + prices[i].price);
                        break;
                    }
                }else throw wrongShop;
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
