package com.lakeskluckybrowser.smartfastbrowser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class AboutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        StartAppSDK.init(this, "203268728", true);
     //   StartAppSDK.setTestAdsEnabled(true);

        RelativeLayout relativeLayout=findViewById(R.id.layout8);
        AnimationDrawable animationDrawable=(AnimationDrawable)relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();



    }
    @Override
    public void onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed();
    }

}
