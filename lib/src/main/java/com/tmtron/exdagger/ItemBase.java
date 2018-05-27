package com.tmtron.exdagger;

public abstract class ItemBase {

    private final String id;

    protected ItemBase(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ItemId="+id;
    }
}
