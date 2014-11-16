package com.example.yogesh.ecoinfo;

import android.app.Activity;
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
import android.webkit.WebView;


public class EcoSystem extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_system);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.eco_system, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_eco_system, container, false);
            String htmlText = " %s ";
            String myData = "\"An ecosystem consists of the biological community that occurs in some locale, and the physical and chemical factors that make up its non-living or abiotic environment. There are many examples of ecosystems -- a pond, a forest, an estuary, a grassland. The boundaries are not fixed in any objective way, although sometimes they seem obvious, as with the shoreline of a small pond. Usually the boundaries of an ecosystem are chosen for practical reasons having to do with the goals of the particular study.\n" +
                    "             The study of ecosystems mainly consists of the study of certain processes that link the living, or biotic, components to the non-living, or abiotic, components. Energy transformations and biogeochemical cycling are the main processes that comprise the field of ecosystem ecology. As we learned earlier, ecology generally is defined as the interactions of organisms with one another and with the environment in which they occur. We can study ecology at the level of the individual, the population, the community, and the ecosystem.\n" +
                    "             Studies of individuals are concerned mostly about physiology, reproduction, development or behavior, and studies of populations usually focus on the habitat and resource needs of individual species, their group behaviors, population growth, and what limits their abundance or causes extinction. Studies of communities examine how populations of many species interact with one another, such as predators and their prey, or competitors that share common needs or resources.\n" +
                    "             In ecosystem ecology we put all of this together and, insofar as we can, we try to understand how the system operates as a whole. This means that, rather than worrying mainly about particular species, we try to focus on major functional aspects of the system. These functional aspects include such things as the amount of energy that is produced by photosynthesis, how energy or materials flow along the many steps in a food chain, or what controls the rate of decomposition of materials or the rate at which nutrients are recycled in the system. \"";

            WebView webView = (WebView) rootView.findViewById(R.id.webView1);
            webView.loadData(String.format(htmlText, myData), "text/html", "utf-8");
            return rootView;
        }
    }
}
