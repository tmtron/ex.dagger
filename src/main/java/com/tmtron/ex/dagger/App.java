package com.tmtron.ex.dagger;

import java.util.Set;

import javax.inject.Inject;

class App {

    private final Set<ItemBase> items;

    @Inject
    App(Set<ItemBase> items) {
        this.items = items;
    }

    void start() {
        log("started");
        for (ItemBase item : items) {
            log("item id = " + item.getId());
        }
    }

    static void log(String msg) {
        System.out.println(msg);
    }
}
