package com.example.yogesh.ecoinfo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;



public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread logoTimer = new Thread() {
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer < 4000){
                        sleep(50);
                        logoTimer = logoTimer +50;
                    };
                    startActivity(new Intent("com.tutorial.yogesh.ecoinfo.ECOCLEARSCREEN"));
                }

                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                finally{
                    finish();
                }
            }
        };

        logoTimer.start();
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends android.app.Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.activity_splash, container, false);

            return rootView;
        }
    }
    protected void onDestroy() {

        super.onDestroy();

    }
   /* public void sendEcoSystemMessage(View view)
    {
        System.out.println("First activity's button clicked");
        Intent intent = new Intent(this, EcoSystem.class);
        startActivity(intent);
    }
    public void sendNGOMessage(View view)
    {
        System.out.println("First activity's button clicked");
        Intent intent = new Intent(this, NGOs.class);
        startActivity(intent);
    }
    public void sendProductsMessage(View view)
    {
        System.out.println("First activity's button clicked");
        Intent intent = new Intent(this, Products.class);
        startActivity(intent);
    }
    public void sendActsMessage(View view)
    {
        System.out.println("First activity's button clicked");
        Intent intent = new Intent(this, Acts.class);
        startActivity(intent);
    }
    public void sendArticlesMessage(View view)
    {
        System.out.println("First activity's button clicked");
        Intent intent = new Intent(this, Articles.class);
        startActivity(intent);
    }
    public void sendTipsMessage(View view)
    {
        System.out.println("First activity's button clicked");
        Intent intent = new Intent(this, Tips.class);
        startActivity(intent);
    }*/


}
