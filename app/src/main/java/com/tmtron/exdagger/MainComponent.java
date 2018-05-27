package com.tmtron.exdagger;

import com.tmtron.exdagger.a.ModuleA;
import com.tmtron.exdagger.b.ModuleB;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {ModuleA.class, ModuleB.class}
)
interface MainComponent {

    App app();

}
