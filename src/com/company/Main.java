package com.company;
import com.company.sweet.Sweet;
import com.company.sweet.Candy;
import com.company.sweet.Caramel;
import com.company.sweet.Chocolate;


public class Main {

    public static void main(String[] args) {
        Candy candy1 = new Candy("Мишки на севере", 100, 190, 1112);
        Chocolate chocolate1 = new Chocolate("Алёнка", 100, 60, 1123);
        Caramel caramel1 = new Caramel("Дюшес", 100, 85, 1143);
        Caramel caramel2 = new Caramel();
        caramel2.setName("Мята");
        caramel2.setWeigth(150);
        caramel2.setPrice(90.5);
        caramel2.setArticle(1154);
        Sweet [] box = {candy1,chocolate1,caramel1,caramel2};
        int allWeight = 0;
        double allPrice = 0;
        for (Sweet someSweet : box) {
            System.out.println(someSweet.toString());
            allWeight += someSweet.getWeight();
            allPrice += someSweet.getPrice();
        }
        System.out.println("\nПодарок: цена " + allPrice + " руб., вес " + allWeight + " г.");
    }
}
