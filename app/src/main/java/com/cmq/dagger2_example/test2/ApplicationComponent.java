package com.cmq.dagger2_example.test2;

import dagger.Component;

/**
 * Created by cuimingqiang on 15/7/14.
 */
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    DaggerApplication injectApplication(DaggerApplication daggerApplication);
}
