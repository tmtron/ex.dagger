package com.tmtron.exdagger;

import com.tmtron.exdagger.a.ModuleA;
import com.tmtron.exdagger.b.ModuleB;
import com.tmtron.exdagger.c.ModuleC;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(
        modules = {
                ModuleA.class
                , ModuleB.class
                , ModuleC.class
        }
)
interface MainComponent {

    App app();

}
