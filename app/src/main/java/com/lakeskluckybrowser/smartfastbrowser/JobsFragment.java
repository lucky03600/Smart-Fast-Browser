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
public class JobsFragment extends Fragment implements View.OnClickListener{

   private EditText searchurl3;
  private   Button searchbtn3;
   private Button indeed,careerbuilder,dice,
    idealist,googleforjobs,glassdoor,
    linkedin3,linkup,monster,
    timesjob,shine,freshersworld,
    freelance,upwork,jobsarkari;


    public JobsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_jobs, container, false);

        RelativeLayout relativeLayout=view.findViewById(R.id.layout3);
        AnimationDrawable animationDrawable=(AnimationDrawable)relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(3000);
        animationDrawable.start();



        searchurl3=(EditText)view.findViewById(R.id.searchurl3);
        searchbtn3=(Button)view.findViewById(R.id.searchbtn3);

        indeed=(Button)view.findViewById(R.id.indeed);
        careerbuilder=(Button)view.findViewById(R.id.careerbuilder);
        dice=(Button)view.findViewById(R.id.dice);
        idealist=(Button)view.findViewById(R.id.idealist);
        googleforjobs=(Button)view.findViewById(R.id.googlejobs);
        glassdoor=(Button)view.findViewById(R.id.glassdoor);
        linkedin3=(Button)view.findViewById(R.id.linkedin4);
        linkup=(Button)view.findViewById(R.id.linkup);
        monster=(Button)view.findViewById(R.id.monster);
        timesjob=(Button)view.findViewById(R.id.timesjobs);
        shine=(Button)view.findViewById(R.id.shine);
        freshersworld=(Button)view.findViewById(R.id.fresherworld);
        freelance=(Button)view.findViewById(R.id.freelancer);
        upwork=(Button)view.findViewById(R.id.upwork);
        jobsarkari=(Button)view.findViewById(R.id.jobsarkari);

        searchbtn3.setOnClickListener(this);

        indeed.setOnClickListener(this);
        careerbuilder.setOnClickListener(this);
        dice.setOnClickListener(this);
        idealist.setOnClickListener(this);
        googleforjobs.setOnClickListener(this);
        glassdoor.setOnClickListener(this);
        linkedin3.setOnClickListener(this);
        linkup.setOnClickListener(this);
        monster.setOnClickListener(this);
        timesjob.setOnClickListener(this);
        shine.setOnClickListener(this);
        freshersworld.setOnClickListener(this);
        freelance.setOnClickListener(this);
        upwork.setOnClickListener(this);
        jobsarkari.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {

        if (view==searchbtn3)
        {
            openBrowser();
        }
        if (view==indeed)
        {
            Intent indeedIntent=new Intent(getActivity(),SearchActivity.class);
            indeedIntent.putExtra("urlSearch","https://www.indeed.co.in");
            startActivity(indeedIntent);
        }
        if (view==careerbuilder)
        {
            Intent careerIntent=new Intent(getActivity(),SearchActivity.class);
            careerIntent.putExtra("urlSearch","https://www.careerbuilder.co.in");
            startActivity(careerIntent);
        }
        if (view==dice)
        {
            Intent diceIntent=new Intent(getActivity(),SearchActivity.class);
            diceIntent.putExtra("urlSearch","https://www.dice.com");
            startActivity(diceIntent);
        }
        if (view==idealist)
        {
            Intent idealistIntent=new Intent(getActivity(),SearchActivity.class);
            idealistIntent.putExtra("urlSearch","https://www.idealist.org");
            startActivity(idealistIntent);
        }
        if (view==googleforjobs)
        {
            Intent googlejobsIntent=new Intent(getActivity(),SearchActivity.class);
            googlejobsIntent.putExtra("urlSearch","https://careers.google.com");
            startActivity(googlejobsIntent);
        }
        if (view==glassdoor)
        {
            Intent glassdoorIntent=new Intent(getActivity(),SearchActivity.class);
            glassdoorIntent.putExtra("urlSearch","https://www.glassdoor.co.in");
            startActivity(glassdoorIntent);
        }
        if (view==linkedin3)
        {
            Intent linkedinIntent=new Intent(getActivity(),SearchActivity.class);
            linkedinIntent.putExtra("urlSearch","https://www.linkedin.com");
            startActivity(linkedinIntent);
        }
        if (view==linkup)
        {
            Intent netflixIntent=new Intent(getActivity(),SearchActivity.class);
            netflixIntent.putExtra("urlSearch","https://www.linkup.com");
            startActivity(netflixIntent);
        }
        if (view==monster)
        {
            Intent monsterIntent=new Intent(getActivity(),SearchActivity.class);
            monsterIntent.putExtra("urlSearch","https://www.monster.com");
            startActivity(monsterIntent);
        }
        if (view==timesjob)
        {
            Intent timesjobIntent=new Intent(getActivity(),SearchActivity.class);
            timesjobIntent.putExtra("urlSearch","https://m.timesjobs.com");
            startActivity(timesjobIntent);
        }
        if (view==shine)
        {
            Intent instagramIntent=new Intent(getActivity(),SearchActivity.class);
            instagramIntent.putExtra("urlSearch","https://www.shine.com");
            startActivity(instagramIntent);
        }
        if (view==freshersworld)
        {
            Intent fresherIntent=new Intent(getActivity(),SearchActivity.class);
            fresherIntent.putExtra("urlSearch","https://www.freshersworld.com");
            startActivity(fresherIntent);
        }
        if (view==freelance)
        {
            Intent freelanceIntent=new Intent(getActivity(),SearchActivity.class);
            freelanceIntent.putExtra("urlSearch","https://www.freelancemyway.com");
            startActivity(freelanceIntent);
        }
        if (view==upwork)
        {
            Intent upworkIntent=new Intent(getActivity(),SearchActivity.class);
            upworkIntent.putExtra("urlSearch","https://www.upwork.com");
            startActivity(upworkIntent);
        }
        if (view==jobsarkari)
        {
            Intent jobsarkariIntent=new Intent(getActivity(),SearchActivity.class);
            jobsarkariIntent.putExtra("urlSearch","https://www.jobsarkari.com");
            startActivity(jobsarkariIntent);
        }


    }

    private void openBrowser() {

        String url_Address=searchurl3.getText().toString();

        if (TextUtils.isEmpty(url_Address))
        {
            Toast.makeText(getActivity(), "Please enter the URL.", Toast.LENGTH_SHORT).show();
        }
        else
        {

            Intent searchIntent=new Intent(getActivity(),SearchActivity.class);
            searchIntent.putExtra("urlSearch",url_Address);
            startActivity(searchIntent);

            searchurl3.setText("");
            searchurl3.requestFocus();
        }
    }
}
