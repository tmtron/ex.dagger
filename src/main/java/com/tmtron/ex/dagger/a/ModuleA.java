package com.tmtron.ex.dagger.a;

import com.tmtron.ex.dagger.ItemBase;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoSet;

@Module
public abstract class ModuleA {

    @Binds
//    @IntoSet
    public abstract ItemBase bind(ItemA item);

}
