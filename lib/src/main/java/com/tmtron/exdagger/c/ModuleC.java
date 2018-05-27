package com.tmtron.exdagger.c;

import com.tmtron.exdagger.ItemBase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

@Module
public class ModuleC {

    @Provides
    @Singleton
    @IntoSet
    ItemBase bind() {
        return new ItemC();
    }
}
