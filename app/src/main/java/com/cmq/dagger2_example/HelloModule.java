package com.cmq.dagger2_example;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liqiang on 2015/7/13.
 */
@Module
public class HelloModule {
    @Provides
    String providerHello(){
        return "hello dagger2";
    }
}
