package com.cmq.dagger2_example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends Activity {
    @InjectView(R.id.tv)
    TextView tv;

    HelloComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
//        component = DaggerHelloComponent.builder().helloModule(new HelloModule()).build();
        component = DaggerHelloComponent.create();
        tv.setText(component.providerHello() + component.providerTime());
    }

    @OnClick(R.id.button)
    public void onButtonClick() {
        tv.setText(component.providerHello() + component.providerTime());
    }
}
