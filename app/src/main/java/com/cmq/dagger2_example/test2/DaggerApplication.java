package com.cmq.dagger2_example.test2;

import android.app.Application;

/**
 * Created by cuimingqiang on 15/7/14.
 */
public class DaggerApplication extends Application{
    private  ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        this.component = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
//        this.component.injectApplication(this);
    }
    public ApplicationComponent getComponent(){
        return this.component;
    }
}
