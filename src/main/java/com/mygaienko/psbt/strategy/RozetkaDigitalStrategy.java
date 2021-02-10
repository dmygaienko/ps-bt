package com.mygaienko.psbt.strategy;

import java.util.Set;

public class RozetkaDigitalStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
        return Set.of("Немає в наявності");
    }

    @Override
    public String getUrl() {
        return "https://rozetka.com.ua/ua/playstation_5_digital_edition_2/p223596301/";
    }

    @Override
    public String getName() {
        return "Rozetka Digital";
    }

}
