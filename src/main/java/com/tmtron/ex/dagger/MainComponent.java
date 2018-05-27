package com.tmtron.ex.dagger;

import com.tmtron.ex.dagger.a.ModuleA;
import com.tmtron.ex.dagger.b.ModuleB;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {ModuleA.class, ModuleB.class}
)
interface MainComponent {

    App app();

}
