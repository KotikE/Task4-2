package com.company.sweet;

public class Caramel extends Sweet {
    private int article;
    public Caramel(){}
        public Caramel(String name, int weight, double price, int article) {
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
    public String toString() {
        return "Карамель ["+ super.toString() + ",артикул =" + article +"]";
    }

}
