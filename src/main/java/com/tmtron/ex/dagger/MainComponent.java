package com.tmtron.ex.dagger;

import com.tmtron.ex.dagger.a.ModuleA;

import dagger.Component;

@Component(
        modules = {ModuleA.class }
)
interface MainComponent {

    App app();

}
