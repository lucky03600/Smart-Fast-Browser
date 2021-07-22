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
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


/**
 * A simple {@link Fragment} subclass.
 */
public class EducationFragment extends Fragment implements View.OnClickListener{
   private EditText searchurl2;
   private Button searchbtn2;
   private Button cousera1,edx1,acedemic1,
    internet1,bigthink1,brightstorm1,
    cosmo1,khan1,howcast1,
    udemy1,byjus1,unacedemy1,
    lynda1,toppr1,ted1;



    public EducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_education, container, false);

        RelativeLayout relativeLayout=view.findViewById(R.id.layout2);
        AnimationDrawable animationDrawable=(AnimationDrawable)relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();


        searchurl2=(EditText)view.findViewById(R.id.search2);

        searchbtn2=(Button)view.findViewById(R.id.searchbtn2);

        cousera1=(Button)view.findViewById(R.id.coursera);
        edx1=(Button)view.findViewById(R.id.edx);
        acedemic1=(Button)view.findViewById(R.id.academic);
        internet1=(Button)view.findViewById(R.id.internet);
        bigthink1=(Button)view.findViewById(R.id.bigthink);
        brightstorm1=(Button)view.findViewById(R.id.brightstorm);
        cosmo1=(Button)view.findViewById(R.id.cosmo);
        khan1=(Button)view.findViewById(R.id.khan);
        howcast1=(Button)view.findViewById(R.id.howcast);
        udemy1=(Button)view.findViewById(R.id.udemy);
        byjus1=(Button)view.findViewById(R.id.byjus);
        unacedemy1=(Button)view.findViewById(R.id.unacedemy);
        lynda1=(Button)view.findViewById(R.id.lynda);
        toppr1=(Button)view.findViewById(R.id.toppr);
        ted1=(Button)view.findViewById(R.id.ted);

        searchbtn2.setOnClickListener(this);

        cousera1.setOnClickListener(this);
        edx1.setOnClickListener(this);
        acedemic1.setOnClickListener(this);
        internet1.setOnClickListener(this);
        bigthink1.setOnClickListener(this);
        brightstorm1.setOnClickListener(this);
        cosmo1.setOnClickListener(this);
        khan1.setOnClickListener(this);
        howcast1.setOnClickListener(this);
        udemy1.setOnClickListener(this);
        byjus1.setOnClickListener(this);
        unacedemy1.setOnClickListener(this);
        lynda1.setOnClickListener(this);
        toppr1.setOnClickListener(this);
        ted1.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        if (view==searchbtn2)
        {
            openBrowser();
        }
        if (view==cousera1)
        {
            Intent courseraIntent=new Intent(getActivity(),SearchActivity.class);
            courseraIntent.putExtra("urlSearch","https://www.coursera.org");
            startActivity(courseraIntent);
        }
        if (view==edx1)
        {
            Intent edxIntent=new Intent(getActivity(),SearchActivity.class);
            edxIntent.putExtra("urlSearch","https://www.edx.org");
            startActivity(edxIntent);
        }
        if (view==acedemic1)
        {
            Intent academicIntent=new Intent(getActivity(),SearchActivity.class);
            academicIntent.putExtra("urlSearch","https://www.academicearth.org");
            startActivity(academicIntent);
        }
        if (view==internet1)
        {
            Intent internetIntent=new Intent(getActivity(),SearchActivity.class);
            internetIntent.putExtra("urlSearch","https://www.archive.org");
            startActivity(internetIntent);
        }
        if (view==bigthink1)
        {
            Intent bigthinkIntent=new Intent(getActivity(),SearchActivity.class);
            bigthinkIntent.putExtra("urlSearch","https://www.bigthink.com");
            startActivity(bigthinkIntent);
        }
        if (view==brightstorm1)
        {
            Intent brightIntent=new Intent(getActivity(),SearchActivity.class);
            brightIntent.putExtra("urlSearch","https://www.brightstorm.com");
            startActivity(brightIntent);
        }
        if (view==cosmo1)
        {
            Intent cosmoIntent=new Intent(getActivity(),SearchActivity.class);
            cosmoIntent.putExtra("urlSearch","https://www.cosmolearning.org");
            startActivity(cosmoIntent);
        }
        if (view==khan1)
        {
            Intent khanIntent=new Intent(getActivity(),SearchActivity.class);
            khanIntent.putExtra("urlSearch","https://www.khanacademy.org");
            startActivity(khanIntent);
        }
        if (view==howcast1)
        {
            Intent howcastIntent=new Intent(getActivity(),SearchActivity.class);
            howcastIntent.putExtra("urlSearch","https://www.howcast.com");
            startActivity(howcastIntent);
        }
        if (view==udemy1)
        {
            Intent udemyIntent=new Intent(getActivity(),SearchActivity.class);
            udemyIntent.putExtra("urlSearch","https://www.udemy.com");
            startActivity(udemyIntent);
        }
        if (view==byjus1)
        {
            Intent byjusIntent=new Intent(getActivity(),SearchActivity.class);
            byjusIntent.putExtra("urlSearch","https://www.byjus.com");
            startActivity(byjusIntent);
        }
        if (view==unacedemy1)
        {
            Intent unacademyIntent=new Intent(getActivity(),SearchActivity.class);
            unacademyIntent.putExtra("urlSearch","https://www.unacademy.com");
            startActivity(unacademyIntent);
        }
        if (view==lynda1)
        {
            Intent lyndaIntent=new Intent(getActivity(),SearchActivity.class);
            lyndaIntent.putExtra("urlSearch","https://www.lynda.com");
            startActivity(lyndaIntent);
        }
        if (view==toppr1)
        {
            Intent topprIntent=new Intent(getActivity(),SearchActivity.class);
            topprIntent.putExtra("urlSearch","https://www.toppr.com");
            startActivity(topprIntent);
        }
        if (view==ted1)
        {
            Intent tedIntent=new Intent(getActivity(),SearchActivity.class);
            tedIntent.putExtra("urlSearch","https://www.ted.com");
            startActivity(tedIntent);
        }

    }

    private void openBrowser() {

        String url_Address=searchurl2.getText().toString();

        if (TextUtils.isEmpty(url_Address))
        {
            Toast.makeText(getActivity(), "Please enter the URL.", Toast.LENGTH_SHORT).show();
        }
        else
        {

            Intent searchIntent=new Intent(getActivity(),SearchActivity.class);
            searchIntent.putExtra("urlSearch",url_Address);
            startActivity(searchIntent);

            searchurl2.setText("");
            searchurl2.requestFocus();
        }
    }
}
