package com.androidtutz.anushka.didemo;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class NCBatteryModule {

    @Provides
    Battery provideNCBattery(NickelCadmiumBattery nickelCadmiumBattery) {

        nickelCadmiumBattery.showType();
        return nickelCadmiumBattery;
    }

}
