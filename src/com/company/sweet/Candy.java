package com.company.sweet;

public class Candy extends Sweet {
    private int article;
    public Candy(String name, int weight, double price, int article) {
        super(name, weight, price);
        this.article = article;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    @Override
    public String toString(){
        return "Конфеты ["+ super.toString() + ",артикул = " + article +"]";
    }
}
