package com.cmq.dagger2_example.test2;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by cuimingqiang on 15/7/14.
 */
public class ToastHelper {
    Toast toast;
    @Inject
    ToastHelper(){};
    public void show(Context context,String msg){
        if(toast==null){
            toast = Toast.makeText(context,msg,Toast.LENGTH_SHORT);
        }else {
            toast.setText(msg);
        }
        toast.show();
    }
}
