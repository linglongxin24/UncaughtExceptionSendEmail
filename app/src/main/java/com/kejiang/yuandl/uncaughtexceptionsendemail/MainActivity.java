package com.kejiang.yuandl.uncaughtexceptionsendemail;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity
        extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button crashMainThreadButton = (Button)findViewById(R.id.button_crash_main_thread);
        Button crashBgThreadButton = (Button)findViewById(R.id.button_crash_bg_thread);
        Button crashWithDelayButton = (Button)findViewById(R.id.button_crash_with_delay);

        crashMainThreadButton.setOnClickListener(new OnClickListener()
        {
            public void onClick(View view) {
                throw new RuntimeException("I'm a cool exception and I crashed the main thread!");
            }

        });
//
    }
}

