package com.bluewolftek.www.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        /*
        Iterate through all buttons in ViewGroup
        found at:
        http://stackoverflow.com/questions/7048470/easy-way-to-setonclicklistener-on-all-activity-buttons
        from:
        User kcoppock on Aug 13 '11 at 4:18
        */
        ViewGroup portfolioButtons = (ViewGroup)findViewById(R.id.portfolio_layout);
        View v;
        for (int i = 0; i < portfolioButtons.getChildCount(); i++) {
            v = portfolioButtons.getChildAt(i);
            if(v instanceof Button) v.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.popularMovies_button:
                makeToast("Popular Movies");
                break;
            case R.id.stockHawk_button:
                makeToast("Stock Hawk");
                break;
            case R.id.buildItBigger_button:
                makeToast("Build It Bigger");
                break;
            case R.id.makeYourAppMaterial_button:
                makeToast("Make Your App Material");
                break;
            case R.id.goUbiquitous_button:
                makeToast("Go Ubiquitous");
                break;
            case R.id.capstone_button:
                makeToast("Capstone");
                break;
            default:
                makeToast("No such project exists!  How'd you find that button?");
                break;
        }
    }

    public void makeToast(String mToast) {
        Toast.makeText(this, "This button will launch my " + mToast + " app!", Toast.LENGTH_SHORT).show();
    }
}
