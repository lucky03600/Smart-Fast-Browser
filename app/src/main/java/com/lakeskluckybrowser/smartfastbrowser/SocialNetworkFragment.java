package com.lakeskluckybrowser.smartfastbrowser;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;


/**
 * A simple {@link Fragment} subclass.
 */
public class SocialNetworkFragment extends Fragment implements View.OnClickListener{
   private EditText searchurl1;
    private Button search_btn1;
    private ImageView facebook1,instagram1,skype1,linkedin1,
           whatsapp1,youtube1,reddit1,snapchat1,
           twitter1,tinder1,viber1,tumblr1,
           tiktok1,vk1,pinterest1,line1;


    public SocialNetworkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_social_network, container, false);

        RelativeLayout relativeLayout=view.findViewById(R.id.layout1);
        AnimationDrawable animationDrawable=(AnimationDrawable)relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();



        searchurl1=(EditText)view.findViewById(R.id.search1);
        search_btn1=(Button)view.findViewById(R.id.searchbtn1);

        facebook1=(ImageView)view.findViewById(R.id.facebook1);
        instagram1=(ImageView)view.findViewById(R.id.instagram1);
        skype1=(ImageView)view.findViewById(R.id.skype1);
        linkedin1=(ImageView)view.findViewById(R.id.linkedin1);
        whatsapp1=(ImageView)view.findViewById(R.id.whatsapp1);
        youtube1=(ImageView)view.findViewById(R.id.youtube1);
        reddit1=(ImageView)view.findViewById(R.id.reddit1);
        snapchat1=(ImageView)view.findViewById(R.id.snapchat1);
        twitter1=(ImageView)view.findViewById(R.id.twitter1);
        tinder1=(ImageView)view.findViewById(R.id.tinder1);
        viber1=(ImageView)view.findViewById(R.id.viber1);
        tumblr1=(ImageView)view.findViewById(R.id.tumblr1);
        tiktok1=(ImageView)view.findViewById(R.id.tiktok1);
        vk1=(ImageView)view.findViewById(R.id.vk1);
        pinterest1=(ImageView)view.findViewById(R.id.pinterest1);
        line1=(ImageView)view.findViewById(R.id.line1);

        search_btn1.setOnClickListener(this);

        facebook1.setOnClickListener(this);
        instagram1.setOnClickListener(this);
        skype1.setOnClickListener(this);
        linkedin1.setOnClickListener(this);
        whatsapp1.setOnClickListener(this);
        youtube1.setOnClickListener(this);
        reddit1.setOnClickListener(this);
        snapchat1.setOnClickListener(this);
        twitter1.setOnClickListener(this);
        tinder1.setOnClickListener(this);
        viber1.setOnClickListener(this);
        tumblr1.setOnClickListener(this);
        tiktok1.setOnClickListener(this);
        vk1.setOnClickListener(this);
        pinterest1.setOnClickListener(this);
        line1.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        if (view==search_btn1)
        {
            openBrowser();
        }
        if (view==facebook1)
        {
            Intent facebookIntent=new Intent(getActivity(),SearchActivity.class);
            facebookIntent.putExtra("urlSearch","https://www.facebook.com");
            startActivity(facebookIntent);
        }
        if (view==instagram1)
        {
            Intent instagramIntent=new Intent(getActivity(),SearchActivity.class);
            instagramIntent.putExtra("urlSearch","https://www.instagram.com");
            startActivity(instagramIntent);
        }
        if (view==skype1)
        {
            Intent skypeIntent=new Intent(getActivity(),SearchActivity.class);
            skypeIntent.putExtra("urlSearch","https://www.skype.com");
            startActivity(skypeIntent);
        }
        if (view==linkedin1)
        {
            Intent linkedinIntent=new Intent(getActivity(),SearchActivity.class);
            linkedinIntent.putExtra("urlSearch","https://www.linkedin.com");
            startActivity(linkedinIntent);
        }
        if (view==whatsapp1)
        {
            Intent whatsappIntent=new Intent(getActivity(),SearchActivity.class);
            whatsappIntent.putExtra("urlSearch","https://www.WhatsApp.com");
            startActivity(whatsappIntent);
        }
        if (view==youtube1)
        {
            Intent youtubeIntent=new Intent(getActivity(),SearchActivity.class);
            youtubeIntent.putExtra("urlSearch","https://www.youtube.com");
            startActivity(youtubeIntent);
        }
        if (view==reddit1)
        {
            Intent redditIntent=new Intent(getActivity(),SearchActivity.class);
            redditIntent.putExtra("urlSearch","https://www.reddit.com");
            startActivity(redditIntent);
        }
        if (view==snapchat1)
        {
            Intent snapchatIntent=new Intent(getActivity(),SearchActivity.class);
            snapchatIntent.putExtra("urlSearch","https://www.snapchat.com");
            startActivity(snapchatIntent);
        }
        if (view==twitter1)
        {
            Intent twitterIntent=new Intent(getActivity(),SearchActivity.class);
            twitterIntent.putExtra("urlSearch","https://www.twitter.com");
            startActivity(twitterIntent);
        }
        if (view==tinder1)
        {
            Intent tinderIntent=new Intent(getActivity(),SearchActivity.class);
            tinderIntent.putExtra("urlSearch","https://www.tinder.com");
            startActivity(tinderIntent);
        }
        if (view==viber1)
        {
            Intent viberIntent=new Intent(getActivity(),SearchActivity.class);
            viberIntent.putExtra("urlSearch","https://www.viber.com");
            startActivity(viberIntent);
        }
        if (view==tumblr1)
        {
            Intent tumblrIntent=new Intent(getActivity(),SearchActivity.class);
            tumblrIntent.putExtra("urlSearch","https://www.tumblr.com");
            startActivity(tumblrIntent);
        }
        if (view==tiktok1)
        {
            Intent tiktokIntent=new Intent(getActivity(),SearchActivity.class);
            tiktokIntent.putExtra("urlSearch","https://www.tiktok.com");
            startActivity(tiktokIntent);
        }
        if (view==vk1)
        {
            Intent vkIntent=new Intent(getActivity(),SearchActivity.class);
            vkIntent.putExtra("urlSearch","https://www.vk.com");
            startActivity(vkIntent);
        }
        if (view==pinterest1)
        {
            Intent pinterestIntent=new Intent(getActivity(),SearchActivity.class);
            pinterestIntent.putExtra("urlSearch","https://www.pinterest.com");
            startActivity(pinterestIntent);
        }
        if (view==line1)
        {
            Intent lineIntent=new Intent(getActivity(),SearchActivity.class);
            lineIntent.putExtra("urlSearch","https://line.me");
            startActivity(lineIntent);
        }


    }

    private void openBrowser() {

        String url_Address=searchurl1.getText().toString();

        if (TextUtils.isEmpty(url_Address))
        {
            Toast.makeText(getActivity(), "Please enter the URL.", Toast.LENGTH_SHORT).show();
        }
        else
        {

            Intent searchIntent=new Intent(getActivity(),SearchActivity.class);
            searchIntent.putExtra("urlSearch",url_Address);
            startActivity(searchIntent);

            searchurl1.setText("");
            searchurl1.requestFocus();
        }
    }
}
