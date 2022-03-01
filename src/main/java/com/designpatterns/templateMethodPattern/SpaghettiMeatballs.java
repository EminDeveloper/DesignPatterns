package com.designpatterns.templateMethodPattern;

public class SpaghettiMeatballs extends PastaDish {

    public void addPasta() {
        System.out.println("Add spaghetti");
    }

    public void addProtein() {
        System.out.println("Add meatballs");
    }

    public void addSauce() {
        System.out.println("Add tomato sauce");
    }

    public void addGarnish() {
        System.out.println("Add Parmesan cheese");
    }
}
