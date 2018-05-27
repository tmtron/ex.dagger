package com.tmtron.exdagger.b;

import com.tmtron.exdagger.ItemBase;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;

@Module
public abstract class ModuleB {

    @Binds
    @IntoSet
    abstract ItemBase bind(ItemB item);

}
