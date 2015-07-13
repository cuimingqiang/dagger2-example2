package com.cmq.dagger2_example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cuimingqiang on 15/7/13.
 */
@Module
public class TimeModule {
    @Singleton
    @Provides
    long providerTime(){
        return System.currentTimeMillis();
    }
}
