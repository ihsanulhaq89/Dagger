package com.example.ihsan.daggerdemoapp.dagger.components;


import com.example.ihsan.daggerdemoapp.activities.MainActivity;
import com.example.ihsan.daggerdemoapp.dagger.modules.CarouselModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CarouselModule.class})
public interface SharedComponent {
    void inject(MainActivity activity);
}