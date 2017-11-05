package com.jorgesanmartin.sample.ui.view.splash;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.ContextCompat;

import com.jorgesanmartin.sample.ui.view.AppNavigation;
import com.jorgesanmartin.sample.ui.view.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    private static final long splashTime = 2000;
    private Handler handler = new Handler(Looper.myLooper());
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            AppNavigation appNavigation = new AppNavigation(SplashActivity.this);
            appNavigation.launchHome();
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(runnable, splashTime);
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SplashScreen(this));
        setStatusColor(ContextCompat.getColor(this, android.R
                .color.white));    }
}
