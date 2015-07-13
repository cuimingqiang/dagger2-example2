package com.cmq.dagger2_example;

import dagger.Component;

/**
 * Created by liqiang on 2015/7/13.
 */
@Component(
        modules = {HelloModule.class}
)
public interface HelloComponent {
        String providerHello();
}
