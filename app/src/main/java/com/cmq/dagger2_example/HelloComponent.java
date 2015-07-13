package com.cmq.dagger2_example;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by liqiang on 2015/7/13.
 */
@Singleton
@Component(
        modules = {HelloModule.class,TimeModule.class}
)
public interface HelloComponent {
        String providerHello();
        long providerTime();
}
