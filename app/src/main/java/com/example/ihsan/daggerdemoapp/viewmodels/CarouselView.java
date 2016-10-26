package com.example.ihsan.daggerdemoapp.viewmodels;


import com.example.ihsan.daggerdemoapp.models.Carousel;

public class CarouselView {
    private final Carousel carouselInfo;

    public CarouselView(Carousel data){
        this.carouselInfo = data;
    }

    public Carousel getCarouselInfo() {
        return carouselInfo;
    }

    @Override
    public String toString() {
        return "CarouselView{" +
                "carouselInfo=" + carouselInfo +
                '}';
    }
}
