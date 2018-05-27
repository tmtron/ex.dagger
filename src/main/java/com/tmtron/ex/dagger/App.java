package com.tmtron.ex.dagger;

import com.tmtron.ex.dagger.a.ItemA;
import com.tmtron.ex.dagger.a.ItemA1;

import javax.inject.Inject;

public class App {

    private final ItemA itemA;
    private final ItemA1 itemA1;

    @Inject
    public App(ItemA itemA, ItemA1 itemA1) {
        this.itemA = itemA;
        this.itemA1 = itemA1;
    }

    public static void log(String msg) {
        System.out.println(msg);
    }

    public void start() {
        log("started");
        log("itemA id = "+itemA.getId());
        log("itemA1 id = "+itemA1.getId());
    }
}
