package com.example.designpatterns.singleton;

public class Run {
    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance().singletonTest();

        StaticBlockSingleton.getStaticBlockSingleton().singletonTest();

        LazySingleton.getLazySingleton().singletonTest();

        ThreadSafeSingleton.getThreadSafeSingleton().singletonTest();

        BillPughSingleton.getInstance().singletonTest();
    }
}