package com.crashcourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class ScrollingActivity extends AppCompatActivity {

    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        MobileAds.initialize(this, "ca-app-pub-9787373154907443~6073911157");

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        AdRequest request = new AdRequest.Builder()
                .addTestDevice("7550DB6338D573BF3B585BB0414268B6")
                .build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void goToAnatomyPage(View v) {
        Intent intent = new Intent(this, AnatomyPage.class);
        startActivity(intent);
    }

    public void goToAstronomy(View v) {
        Intent intent = new Intent(this, astronomy.class);
        startActivity(intent);
    }

    public void goToHistory(View v) {
        Intent intent = new Intent(this, BigHistory.class);
        startActivity(intent);
    }

    public void goToBiology(View v){
        Intent intent = new Intent(this, BiologyPage.class);
        startActivity(intent);

    }

    public void goToChemistry(View v){
        Intent intent = new Intent(this, ChemPage.class);
        startActivity(intent);
    }

    public void goToEcology(View v){
        Intent intent = new Intent(this, EcoPage.class);
        startActivity(intent);
    }

    public void goToEconomics(View v){
        Intent intent = new Intent(this, Economics.class);
        startActivity(intent);
    }

    public void goToIP(View v){
        Intent intent = new Intent(this, intellectualproperty.class);
        startActivity(intent);
    }

    public void goToGov(View v){
        Intent intent = new Intent(this, gov.class);
        startActivity(intent);
    }

    public void goToGames(View v){
        Intent intent = new Intent(this, games.class);
        startActivity(intent);
    }

    public void goToPsych(View v){
        Intent intent = new Intent(this,psych.class);
        startActivity(intent);
    }

    public void goTous(View v){
        Intent intent = new Intent(this,us.class);
        startActivity(intent);
    }

    public void goToSoc(View v){
        Intent intent = new Intent(this,sociology.class);
        startActivity(intent);
    }

    public void goToCompSci(View v){
        Intent intent = new Intent(this,compsci.class);
        startActivity(intent);
    }

    public void goToFilm(View v){
        Intent intent = new Intent(this,film.class);
        startActivity(intent);
    }

    public void goToWH(View v){
        Intent intent = new Intent(this,whone.class);
        startActivity(intent);
    }

    public void goToWH2(View v){
        Intent intent = new Intent(this,wh2.class);
        startActivity(intent);
    }
    public void goToLit(View v){
        Intent intent = new Intent(this,literature.class);
        startActivity(intent);
    }
    public void goTomyth(View v){
        Intent intent = new Intent(this,mythology.class);
        startActivity(intent);
    }

    public void goToPhys(View v){
        Intent intent = new Intent(this,physics.class);
        startActivity(intent);
    }

    public void goToPhil(View v){
        Intent intent = new Intent(this,philosophy.class);
        startActivity(intent);
    }

}
