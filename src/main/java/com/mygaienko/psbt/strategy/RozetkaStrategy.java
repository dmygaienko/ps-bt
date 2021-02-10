package com.mygaienko.psbt.strategy;

import java.util.Set;

public class RozetkaStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
        return Set.of("Немає в наявності");
    }

    @Override
    public String getUrl() {
        return "https://rozetka.com.ua/ua/playstation_5/p223588825/";
    }

    @Override
    public String getName() {
        return "Rozetka";
    }

}
