package com.tmtron.ex.dagger.a;

import com.tmtron.ex.dagger.ItemBase;

import javax.inject.Inject;

public class ItemA extends ItemBase {

    @Inject
    public ItemA() {
        super("A");
    }
}
