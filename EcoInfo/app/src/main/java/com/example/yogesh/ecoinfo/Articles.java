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


public class Articles extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.articles, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_articles, container, false);
            final TextView forumfutureblog = (TextView) rootView.findViewById(R.id.forumfutureblog);
            forumfutureblog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.forumforthefuture.org/blogs"));
                    startActivity(webintent);
                }
            });
            final TextView wriblog = (TextView) rootView.findViewById(R.id.wriblog);
            wriblog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.wri.org/blog"));
                    startActivity(webintent);
                }
            });
            final TextView edfblog = (TextView) rootView.findViewById(R.id.edfblog);
            edfblog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.edf.org/blog"));
                    startActivity(webintent);
                }
            });
            final TextView rainforestblog = (TextView) rootView.findViewById(R.id.rainforestblog);
            rainforestblog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.rainforest-alliance.org/newsroom/press-releases/frog-blog-relaunch"));
                    startActivity(webintent);
                }
            });
            final TextView ceresblog = (TextView) rootView.findViewById(R.id.ceresblog);
            ceresblog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ceres.org/bicep/press/the-bicep-blog"));
                    startActivity(webintent);
                }
            });
            final TextView sierrablog = (TextView) rootView.findViewById(R.id.sierrablog);
            sierrablog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sierraclub.org/blogs"));
                    startActivity(webintent);
                }
            });
            final TextView greenpeaceblog = (TextView) rootView.findViewById(R.id.greenpeaceblog);
            greenpeaceblog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://greenpeaceblogs.org/"));
                    startActivity(webintent);
                }
            });
            final TextView onepercentblog = (TextView) rootView.findViewById(R.id.onepercentblog);
            onepercentblog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://onepercentfortheplanet.org/blog/"));
                    startActivity(webintent);
                }
            });
            final TextView article1 = (TextView) rootView.findViewById(R.id.article1);
            article1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mindbodygreen.com/0-16168/i-havent-made-any-trash-in-2-years-heres-what-my-life-is-like.html"));
                    startActivity(webintent);
                }
            });
            final TextView article2 = (TextView) rootView.findViewById(R.id.article2);
            article2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://news.nationalgeographic.com/news/2014/08/140825-bird-environment-chemical-contaminant-climate-change-science-winged-warning/"));
                    startActivity(webintent);
                }
            });
            final TextView article3 = (TextView) rootView.findViewById(R.id.article3);
            article3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    final Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mindbodygreen.com/0-16402/the-more-educated-we-are-about-climate-change-the-better-well-adapt.html"));
                    startActivity(webintent);
                }
            });
            return rootView;
        }
    }
}
