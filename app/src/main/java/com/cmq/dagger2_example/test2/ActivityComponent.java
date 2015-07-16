package com.cmq.dagger2_example.test2;

import android.widget.Toast;

import com.cmq.dagger2_example.MainActivity;

import dagger.Component;

/**
 * Created by cuimingqiang on 15/7/14.
 */
@Component(
        dependencies = ApplicationComponent.class,
        modules = ActivityModule.class
)
public interface ActivityComponent {
    MainActivity injectActivity(MainActivity activity);
    ToastHelper getToastHelper();
}
