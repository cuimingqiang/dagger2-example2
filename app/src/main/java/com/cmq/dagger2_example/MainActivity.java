package com.cmq.dagger2_example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.cmq.dagger2_example.test1.HelloComponent;
import com.cmq.dagger2_example.test2.ActivityComponent;
import com.cmq.dagger2_example.test2.ActivityModule;
import com.cmq.dagger2_example.test2.DaggerActivityComponent;
import com.cmq.dagger2_example.test2.DaggerApplication;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends Activity {
    @InjectView(R.id.tv)
    TextView tv;

//    HelloComponent component;
    private ActivityComponent component;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
//        component = DaggerHelloComponent.builder().helloModule(new HelloModule()).build();
//        component = DaggerHelloComponent.create();
//        tv.setText(component.providerHello() + component.providerTime());
        component = DaggerActivityComponent.builder().applicationComponent(((DaggerApplication)getApplication()).getComponent())
                .activityModule(new ActivityModule(this)).build();
//        component.injectActivity(this);
    }

    @OnClick(R.id.button)
    public void onButtonClick() {
//        tv.setText(component.providerHello() + component.providerTime());
        component.getToastHelper().show(this,"dasdasd");
    }
}
