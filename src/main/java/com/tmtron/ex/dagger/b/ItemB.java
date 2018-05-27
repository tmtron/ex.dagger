package com.tmtron.ex.dagger.b;

import com.tmtron.ex.dagger.ItemBase;

import javax.inject.Inject;

class ItemB extends ItemBase {

    @Inject
    ItemB() {
        super("B");
    }
}
