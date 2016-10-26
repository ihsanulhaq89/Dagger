package com.example.ihsan.daggerdemoapp.dagger.modules;

import android.view.View;
import android.widget.TextView;

import com.example.ihsan.daggerdemoapp.R;
import com.example.ihsan.daggerdemoapp.models.Carousel;
import com.example.ihsan.daggerdemoapp.viewmodels.CarouselView;

import dagger.Module;
import dagger.Provides;

@Module
public class CarouselModule {

    private final View view;

    public CarouselModule(View view) {
        this.view = view;
    }


    @Provides
    public CarouselView getCarouselViewModel() {

        TextView name = (TextView) view.findViewById(R.id.nameview);
        TextView info = (TextView) view.findViewById(R.id.infoview);
        TextView data = (TextView) view.findViewById(R.id.dataview);

        Carousel model = new Carousel(name.getText().toString(),
                info.getText().toString(),
                data.getText().toString());

        return new CarouselView(model);
    }
}
