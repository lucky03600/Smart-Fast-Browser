package com.lakeskluckybrowser.smartfastbrowser;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText search_Url;
    private Button searchBtn, homebtn;
   private WebView web_view;
   private String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        StartAppSDK.init(this, "203268728", true);
     //   StartAppSDK.setTestAdsEnabled(true);

        RelativeLayout relativeLayout=findViewById(R.id.layout4);
        AnimationDrawable animationDrawable=(AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();




        search_Url=(EditText)findViewById(R.id.searchurl2);
        searchBtn=(Button)findViewById(R.id.searchbutton1);
        homebtn=(Button)findViewById(R.id.homebutton);
        web_view=(WebView)findViewById(R.id.webView);



        searchBtn.setOnClickListener(this);
        homebtn.setOnClickListener(this);

       url= getIntent().getExtras().get("urlSearch").toString();
       search_Url.setText(url);

        WebSettings webSettings=web_view.getSettings();
        webSettings.setJavaScriptEnabled(true); //prevent web address to open in another area.
        



        web_view.loadUrl(url);
        web_view.setWebViewClient(new WebViewClient());



    }


    @Override
    public void onBackPressed() {
        if (web_view.canGoBack())
        {
            web_view.goBack();


        }
        else
        {
            StartAppAd.onBackPressed(this);
            super.onBackPressed();

        }
    }

    @Override
    public void onClick(View view) {
        if (view==homebtn)
        {
            finish();
            Intent homeIntent=new Intent(SearchActivity.this,MainActivity.class);
            startActivity(homeIntent);
        }
        if (view==searchBtn)
        {
            openSearch();
        }
    }

    private void openSearch() {
        String url_Address=search_Url.getText().toString();

        if (TextUtils.isEmpty(url_Address))
        {
           Toast empty= Toast.makeText(this, "Please enter the URL.", Toast.LENGTH_SHORT);
           empty.show();
        }
        else
            {

            Intent searchIntent = new Intent(SearchActivity.this, SearchActivity.class);
            searchIntent.putExtra("urlSearch", url_Address);
            startActivity(searchIntent);

            search_Url.setText("");
            search_Url.requestFocus();

            }
    }
}
