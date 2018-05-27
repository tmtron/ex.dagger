package com.tmtron.exdagger.a;

import com.tmtron.exdagger.ItemBase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class ModuleA {

    @Provides
    @Singleton
    @IntoSet
    ItemBase bind() {
        return new ItemA();
    }
}
