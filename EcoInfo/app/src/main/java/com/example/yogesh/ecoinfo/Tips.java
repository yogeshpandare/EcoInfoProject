package com.example.yogesh.ecoinfo;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Tips extends Activity {
    TextView tipsview;
    // public ShareActionProvider mShareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.tips, menu);
        //return true;
        //MenuInflater inflater = getMenuInflater();
        //inflater.inflate(R.menu.tips, menu);

       /* // For new Share option - Option 1
        // Inflate menu resource file.
        getMenuInflater().inflate(R.menu.tips, menu);
        // Locate MenuItem with ShareActionProvider
        MenuItem item = menu.findItem(R.id.tipsshare);
        // Fetch and store ShareActionProvider
        mShareActionProvider = (ShareActionProvider) item.getActionProvider();
        // Return true to display menu
        return true; */

        //
        tipsview = (TextView) findViewById(R.id.txt1);
        getMenuInflater().inflate(R.menu.tips, menu);
        MenuItem item = menu.findItem(R.id.menu_item_share);

        ShareActionProvider myShareActionProvider = (ShareActionProvider) item.getActionProvider();

        Intent myIntent = new Intent(Intent.ACTION_SEND);
        myIntent.setType("text/plain");
        myIntent.putExtra(Intent.EXTRA_SUBJECT, "Environmental Tips");
        //myIntent.putExtra(Intent.EXTRA_TEXT, "Share the nature tips");
        //myIntent.putExtra("Share the nature tips", tipsview.getText().toString());
        //myIntent.putExtra(Intent.EXTRA_TEXT, TextView.getDefaultSize(1,1));
        myIntent.putExtra(Intent.EXTRA_TEXT, tipsview.getText().toString());
       //myIntent.putExtra(Intent.EXTRA_TEXT, TextView.getText().toString());
       //myIntent.putExtra(Intent.EXTRA_STREAM, TextView.getText());
        myShareActionProvider.setShareIntent(myIntent);
        //startActivity(Intent.createChooser(myIntent, getResources().getText(R.string.title_activity_tips)));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

/*
        switch (item.getItemId())
        {

            case R.id.menu_item_share:
                //Toast.makeText(MyActivity.this, "Share with your friends", Toast.LENGTH_SHORT).show();
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Tips");
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Environmental Tips");
                startActivity(Intent.createChooser(shareIntent, "Share the tips"));

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }*/

/*
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }*/
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
            View rootView = inflater.inflate(R.layout.fragment_tips, container, false);
            return rootView;

        }
    }
   /* public void setShareIntent(Intent shareIntent) {
        if (mShareActionProvider != null) {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    }*/
}
