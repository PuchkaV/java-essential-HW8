package task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Price [] prices = new Price[2];

    try {
        for (int i = 0; i < prices.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("goods:  ");
            String goodsTmp = sc.nextLine();
            System.out.println("store: ");
            String storeTmp = sc.nextLine();
            System.out.println("price: ");
            double priceTmp = sc.nextDouble();

            prices[i] = new Price(goodsTmp, storeTmp, priceTmp);

        }
    }
    catch (InputMismatchException e){
        System.out.println(e.getMessage());
    }

        Arrays.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price o1, Price o2) {
                return o1.getStore().compareToIgnoreCase(o2.getStore());
            }
        });
    try (Scanner sc = new Scanner(System.in)){
        System.out.println("chose store: ");
        String tmp = sc.nextLine();

        for(Price elem: prices){
           if (elem.getStore().equalsIgnoreCase(tmp)){
                System.out.println(elem.getGoods() + "  " + elem.getPrice());
                break;
           } else throw new MyExeption();

        }
    }
    catch (MyExeption e){
        e.getmessage();
    }

    }

}
