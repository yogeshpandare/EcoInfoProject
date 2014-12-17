package com.example.yogesh.ecoinfo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
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
import android.widget.TextView;


public class Products extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.products, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_products, container, false);
            final TextView product1 = (TextView) rootView.findViewById(R.id.product1);
            product1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ecofriendlyonline.com/"));
                    startActivity(webintent);
                }
            });
            final TextView product2 = (TextView) rootView.findViewById(R.id.product2);
            product2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.buygreen.com/"));
                    startActivity(webintent);
                }
            });
            final TextView product3 = (TextView) rootView.findViewById(R.id.product3);
            product3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ecos.com/"));
                    startActivity(webintent);
                }
            });
            final TextView product4 = (TextView) rootView.findViewById(R.id.product4);
            product4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bambeco.com/"));
                    startActivity(webintent);
                }
            });
            final TextView product5 = (TextView) rootView.findViewById(R.id.product5);
            product5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://eartheasy.com/"));
                    startActivity(webintent);
                }
            });
            final TextView product6 = (TextView) rootView.findViewById(R.id.product6);
            product6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.greenhome.com/"));
                    startActivity(webintent);
                }
            });
            final TextView product7 = (TextView) rootView.findViewById(R.id.product7);
            product7.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.theultimategreenstore.com/default.aspx"));
                    startActivity(webintent);
                }
            });
            final TextView product8 = (TextView) rootView.findViewById(R.id.product8);
            product8.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.certisusa.com/"));
                    startActivity(webintent);
                }
            });

            return rootView;
        }
    }
}
