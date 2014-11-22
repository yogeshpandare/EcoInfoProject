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
import android.widget.Button;
import android.widget.TextView;


public class NGOs extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngos);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ngos, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_ngos, container, false);
            final TextView wwf = (TextView) rootView.findViewById(R.id.wwf);
            wwf.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.wwf.org/"));
                    startActivity(webintent);
                }
            });
            final TextView greenpeace = (TextView) rootView.findViewById(R.id.greenpeace);
            greenpeace.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.greenpeace.org/usa/en/"));
                    startActivity(webintent);
                }
            });
            final TextView chintan = (TextView) rootView.findViewById(R.id.chintan);
            chintan.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.chintan-india.org/"));
                    startActivity(webintent);
                }
            });
            final TextView ies = (TextView) rootView.findViewById(R.id.ies);
            ies.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.iesglobal.org/"));
                    startActivity(webintent);
                }
            });
            final TextView ecofriends = (TextView) rootView.findViewById(R.id.ecofriends);
            ecofriends.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ecofriends.org/"));
                    startActivity(webintent);
                }
            });
            return rootView;
        }
    }

}
