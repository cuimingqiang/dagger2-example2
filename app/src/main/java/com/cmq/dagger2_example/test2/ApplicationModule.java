package com.cmq.dagger2_example.test2;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cuimingqiang on 15/7/14.
 */
@Module
public class ApplicationModule {
    Application application;
    ApplicationModule(Application application){
        this.application = application;
    }
    @Provides
    Application providesApplication(){
        return application;
    }
}
