package com.example.afrin.trafficteacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView cardView1, cardView2, cardView4, cardView5, cardView6, cardViewMap, cardViewAllRoute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView4 = findViewById(R.id.cardView4);
        cardView5 = findViewById(R.id.cardView5);
        cardView6 = findViewById(R.id.cardView6);
        cardViewMap = findViewById(R.id.cardViewMap);
        cardViewAllRoute = findViewById(R.id.cardView_all_route);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
        cardView6.setOnClickListener(this);
        cardViewMap.setOnClickListener(this);
        cardViewAllRoute.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardView1:
                startActivity(new Intent(this, TrafficSignClassification.class));
                break;
            case R.id.cardView2:
                startActivity(new Intent(this, TrafficRule.class));
                break;
            case R.id.cardView4:
                startActivity(new Intent(this, Driving_license.class));
                break;
            case R.id.cardView5:
                startActivity(new Intent(this, Vehicle_reg.class));
                break;
            case R.id.cardView6:
                startActivity(new Intent(this, Fine.class));
                break;

            case R.id.cardViewMap:
                startActivity(new Intent(this, ShowTrafficMap.class));
                break;
            case R.id.cardView_all_route:
                startActivity(new Intent(this, AllRouteInfo.class));
                break;

        }
    }
}
