package com.designpatterns.templateMethodPattern;

public abstract class PastaDish {

    final void makeRecipe() {
        boilWater();
        cookPasta();
        drainAndPlate();
        addPasta();
        addSauce();
        addProtein();
        addGarnish();
    }

    abstract void addPasta();

    abstract void addSauce();

    abstract void addProtein();

    abstract void addGarnish();


    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void cookPasta() {
        System.out.println("Boiling water");
    }

    private void drainAndPlate() {
        System.out.println("Boiling water");
    }

}