package com.cmq.dagger2_example.test2;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by cuimingqiang on 15/7/14.
 */
@Module
public class ActivityModule {
    private Activity activity;
    public ActivityModule(Activity activity){
        this.activity = activity;
    }
    @Provides
    Activity providerActivity(){
        return activity;
    }
}
