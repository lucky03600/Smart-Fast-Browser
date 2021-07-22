package com.lakeskluckybrowser.smartfastbrowser;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.startapp.sdk.adsbase.AutoInterstitialPreferences;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;


public class MainActivity extends AppCompatActivity  {
 private TabLayout mytab;
private ViewPager myPager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StartAppSDK.init(this, "203268728", true);
      //  StartAppSDK.setTestAdsEnabled(true);

        mytab=(TabLayout)findViewById(R.id.myTab);
        myPager=(ViewPager)findViewById(R.id.myViewPager);

        myPager.setAdapter(new myPagerAdapter(getSupportFragmentManager()));
        mytab.setupWithViewPager(myPager);

        mytab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                myPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed();
    }



    class myPagerAdapter extends FragmentPagerAdapter {

        String data[]={"Popular","Social\nNetwork","Education","Jobs"};
        public myPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            if (i==0)
            {
                return new TrendingFragment();
            }
            else if (i==1)
            {
                return new SocialNetworkFragment();

            }
            else if (i==2)
            {
                return new EducationFragment();
            }
            else
            {
                return new JobsFragment();
            }
        }

        @Override
        public int getCount() {
            return data.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return data[position];
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }



    public void aboutAction(MenuItem item) {
        Intent intent=new Intent(MainActivity.this,AboutActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Welcome to Smart & Fast Browser", Toast.LENGTH_LONG).show();
    }
}
