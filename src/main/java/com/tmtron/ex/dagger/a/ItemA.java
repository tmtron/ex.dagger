package com.tmtron.ex.dagger.a;

import com.tmtron.ex.dagger.ItemBase;

import javax.inject.Inject;

class ItemA extends ItemBase {

    @Inject
    ItemA() {
        super("A");
    }
}
