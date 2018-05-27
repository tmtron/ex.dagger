package com.tmtron.ex.dagger;

public class Main {

    public static void main(String[] args) {
        MainComponent component = DaggerMainComponent.builder().build();
        component.app().start();
    }

}
