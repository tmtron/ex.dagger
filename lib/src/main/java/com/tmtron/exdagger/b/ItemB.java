package com.tmtron.exdagger.b;

import com.tmtron.exdagger.ItemBase;

import javax.inject.Inject;

class ItemB extends ItemBase {

    @Inject
    ItemB() {
        super("B");
    }
}
