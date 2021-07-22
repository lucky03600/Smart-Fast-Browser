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


/**
 * A simple {@link Fragment} subclass.
 */
public class TrendingFragment extends Fragment implements View.OnClickListener {
    private EditText searchUrl;
    private Button search_btn;
   private ImageView facebook_btn,google_btn,amazon_btn,youtube_btn,linkedin_btn,whatsapp_btn,
            twitter_btn,netflix_btn,snapchat_btn,github_btn,instagram_btn,imdb_btn,
            quora_btn,yahoo_btn,wikipedia_btn,skype_btn;



    public TrendingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_trending, container, false);

        RelativeLayout relativeLayout=view.findViewById(R.id.layout);
        AnimationDrawable animationDrawable=(AnimationDrawable)relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();



        searchUrl=(EditText)view.findViewById(R.id.searchText);
        search_btn=(Button)view. findViewById(R.id.searchButton);
        facebook_btn=(ImageView) view.findViewById(R.id.facebook);
        google_btn=(ImageView)view. findViewById(R.id.google);
        amazon_btn=(ImageView) view.findViewById(R.id.amazon);
        youtube_btn=(ImageView) view.findViewById(R.id.youtube);
        imdb_btn=(ImageView)view. findViewById(R.id.imdb);
        linkedin_btn=(ImageView)view. findViewById(R.id.linkedin);
        netflix_btn=(ImageView)view. findViewById(R.id.netflix);
        twitter_btn=(ImageView) view.findViewById(R.id.twitter);
        quora_btn=(ImageView)view. findViewById(R.id.quora);
        whatsapp_btn=(ImageView) view.findViewById(R.id.whatsapp);
        instagram_btn=(ImageView) view.findViewById(R.id.instagram);
        wikipedia_btn=(ImageView) view.findViewById(R.id.wikipedia);
        skype_btn=(ImageView) view.findViewById(R.id.skype);
        github_btn=(ImageView) view.findViewById(R.id.github);
        snapchat_btn=(ImageView) view.findViewById(R.id.snapchat);
        yahoo_btn=(ImageView) view.findViewById(R.id.yahoo);

        facebook_btn.setOnClickListener(this);
        google_btn.setOnClickListener(this);
        amazon_btn.setOnClickListener(this);
        youtube_btn.setOnClickListener(this);
        linkedin_btn.setOnClickListener(this);
        whatsapp_btn.setOnClickListener(this);
        twitter_btn.setOnClickListener(this);
        netflix_btn.setOnClickListener(this);
        snapchat_btn.setOnClickListener(this);
        github_btn.setOnClickListener(this);
        instagram_btn.setOnClickListener(this);
        imdb_btn.setOnClickListener(this);
        quora_btn.setOnClickListener(this);
        yahoo_btn.setOnClickListener(this);
        wikipedia_btn.setOnClickListener(this);
        skype_btn.setOnClickListener(this);

        search_btn.setOnClickListener(this);



        return view;
    }

    @Override
    public void onClick(View view) {
        if (view==search_btn)
        {
            openBrowser();
        }
        if (view==facebook_btn)
        {
            Intent facebookIntent=new Intent(getActivity(),SearchActivity.class);
            facebookIntent.putExtra("urlSearch","https://www.facebook.com");
            startActivity(facebookIntent);


        }
        if (view==google_btn)
        {
            Intent googleIntent=new Intent(getActivity(),SearchActivity.class);
            googleIntent.putExtra("urlSearch","https://www.google.com");
            startActivity(googleIntent);
        }
        if (view==amazon_btn)
        {
            Intent amazonIntent=new Intent(getActivity(),SearchActivity.class);
            amazonIntent.putExtra("urlSearch","https://www.amazon.com");
            startActivity(amazonIntent);
        }
        if (view==youtube_btn)
        {
            Intent youtubeIntent=new Intent(getActivity(),SearchActivity.class);
            youtubeIntent.putExtra("urlSearch","https://www.youtube.com");
            startActivity(youtubeIntent);
        }
        if (view==linkedin_btn)
        {
            Intent linkedinIntent=new Intent(getActivity(),SearchActivity.class);
            linkedinIntent.putExtra("urlSearch","https://www.linkedin.com");
            startActivity(linkedinIntent);
        }
        if (view==whatsapp_btn)
        {
            Intent whatsappIntent=new Intent(getActivity(),SearchActivity.class);
            whatsappIntent.putExtra("urlSearch","https://www.whatsapp.com");
            startActivity(whatsappIntent);
        }
        if (view==twitter_btn)
        {
            Intent twitterIntent=new Intent(getActivity(),SearchActivity.class);
            twitterIntent.putExtra("urlSearch","https://www.twitter.com");
            startActivity(twitterIntent);
        }
        if (view==netflix_btn)
        {
            Intent netflixIntent=new Intent(getActivity(),SearchActivity.class);
            netflixIntent.putExtra("urlSearch","https://www.netflix.com");
            startActivity(netflixIntent);
        }
        if (view==snapchat_btn)
        {
            Intent snapchatIntent=new Intent(getActivity(),SearchActivity.class);
            snapchatIntent.putExtra("urlSearch","https://www.snapchat.com");
            startActivity(snapchatIntent);
        }
        if (view==github_btn)
        {
            Intent githubIntent=new Intent(getActivity(),SearchActivity.class);
            githubIntent.putExtra("urlSearch","https://www.github.com");
            startActivity(githubIntent);
        }
        if (view==instagram_btn)
        {
            Intent instagramIntent=new Intent(getActivity(),SearchActivity.class);
            instagramIntent.putExtra("urlSearch","https://www.instagram.com");
            startActivity(instagramIntent);
        }
        if (view==imdb_btn)
        {
            Intent imdbIntent=new Intent(getActivity(),SearchActivity.class);
            imdbIntent.putExtra("urlSearch","https://www.imdb.com");
            startActivity(imdbIntent);
        }
        if (view==quora_btn)
        {
            Intent quoraIntent=new Intent(getActivity(),SearchActivity.class);
            quoraIntent.putExtra("urlSearch","https://www.quora.com");
            startActivity(quoraIntent);
        }
        if (view==yahoo_btn)
        {
            Intent yahooIntent=new Intent(getActivity(),SearchActivity.class);
            yahooIntent.putExtra("urlSearch","https://in.yahoo.com");
            startActivity(yahooIntent);
        }
        if (view==wikipedia_btn)
        {
            Intent wikipediaIntent=new Intent(getActivity(),SearchActivity.class);
            wikipediaIntent.putExtra("urlSearch","https://www.wikipedia.org");
            startActivity(wikipediaIntent);
        }
        if (view==skype_btn)
        {
            Intent skypeIntent=new Intent(getActivity(),SearchActivity.class);
            skypeIntent.putExtra("urlSearch","https://www.skype.com");
            startActivity(skypeIntent);
        }

    }

    private void openBrowser() {

        String url_Address=searchUrl.getText().toString();

        if (TextUtils.isEmpty(url_Address))
        {
            Toast.makeText(getActivity(), "Please enter the URL.", Toast.LENGTH_SHORT).show();
        }
        else
        {

            Intent searchIntent=new Intent(getActivity(),SearchActivity.class);
            searchIntent.putExtra("urlSearch",url_Address);
            startActivity(searchIntent);

            searchUrl.setText("");
            searchUrl.requestFocus();
        }
    }
}
