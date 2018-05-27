package com.tmtron.ex.dagger.a;

import com.tmtron.ex.dagger.ItemBase;

import javax.inject.Inject;

public class ItemA1 extends ItemBase {

    @Inject
    public ItemA1() {
        super("A1");
    }
}
