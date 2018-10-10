package com.example.mohsin.navigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
        loadFragment(new Home());
    }
private boolean loadFragment(Fragment fragment) {
    if (fragment != null) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
    return true;}
    return false;
}
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment frag=null;
        switch (item.getItemId()){
            case R.id.homee:
                frag=new Home();
                break;


        }

        switch (item.getItemId()){
            case R.id.dashboard:
                frag=new DashBoard();
                break;


        }
        switch (item.getItemId()){
            case R.id.notifications:
                frag=new RingBell();
                break;


        }
        switch (item.getItemId()){
            case R.id.messages:
                frag=new Messages();
                break;


        }
        switch (item.getItemId()){
            case R.id.calls:
                frag=new Calls();
                break;


        }







        return loadFragment(frag);
    }
}
