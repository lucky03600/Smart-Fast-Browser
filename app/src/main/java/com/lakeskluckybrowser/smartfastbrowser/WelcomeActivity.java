package com.lakeskluckybrowser.smartfastbrowser;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        StartAppSDK.init(this, "203268728", true);
      //  StartAppSDK.setTestAdsEnabled(true);


        RelativeLayout relativeLayout=findViewById(R.id.layout6);
        AnimationDrawable animationDrawable=(AnimationDrawable)relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(1000);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();

        Thread thread=new Thread()
        {
            @Override
            public void run() {

                try
                {
                   // sleep(7000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent intent=new Intent(WelcomeActivity.this,MainActivity.class);
                    startActivity(intent);
                }

            }


        };

        thread.start();
    }




    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

        public void btnOpenActivity (View view){
            Intent nextActivity = new Intent(this, WelcomeActivity.class);
            startActivity(nextActivity);
            StartAppAd.showAd(this);
        }
}
