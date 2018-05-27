package com.tmtron.exdagger;

public class Main {

    public static void main(String[] args) {
        MainComponent component = DaggerMainComponent.builder().build();
        component.app().start();
    }

}
