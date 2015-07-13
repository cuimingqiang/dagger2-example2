package com.cmq.dagger2_example;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MediaPlayer player = DaggerMediaPlayerComponent.builder().mediaPlayerModule(new MediaPlayerModule()).build().getMediaPlayer();
    }

}
