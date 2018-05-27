package com.tmtron.ex.dagger.b;

import com.tmtron.ex.dagger.ItemBase;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;

@Module
public abstract class ModuleB {

    @Binds
    @IntoSet
    abstract ItemBase bind(ItemB item);

}
