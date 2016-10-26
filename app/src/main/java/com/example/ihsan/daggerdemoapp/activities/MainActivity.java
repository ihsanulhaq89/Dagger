package com.example.ihsan.daggerdemoapp.activities;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.ihsan.daggerdemoapp.R;
import com.example.ihsan.daggerdemoapp.dagger.components.DaggerSharedComponent;
import com.example.ihsan.daggerdemoapp.dagger.components.SharedComponent;
import com.example.ihsan.daggerdemoapp.dagger.modules.CarouselModule;
import com.example.ihsan.daggerdemoapp.models.Carousel;
import com.example.ihsan.daggerdemoapp.viewmodels.CarouselView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject CarouselView viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View v = findViewById(R.id.view);
        SharedComponent mSharedComponent = DaggerSharedComponent.builder().carouselModule(new CarouselModule(v)).build();
        mSharedComponent.inject(this);
        viewModel.getCarouselInfo();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Toast.makeText(this, viewModel.getCarouselInfo().toString(), Toast.LENGTH_SHORT).show();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
