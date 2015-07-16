package com.cmq.dagger2_example.test1;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liqiang on 2015/7/13.
 */

@Module
public class HelloModule {
    @Singleton
    @Provides
    String providerHello() {
        Log.i("tag", "" + System.currentTimeMillis());
        return "hello dagger2" ;
    }
}
