package com.tmtron.ex.dagger.a;

import com.tmtron.ex.dagger.ItemBase;

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
