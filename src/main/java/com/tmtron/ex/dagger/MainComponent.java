package com.tmtron.ex.dagger;

import com.tmtron.ex.dagger.a.ModuleA;
import com.tmtron.ex.dagger.b.ModuleB;

import dagger.Component;

@Component(
        modules = {ModuleA.class, ModuleB.class}
)
interface MainComponent {

    App app();

}
