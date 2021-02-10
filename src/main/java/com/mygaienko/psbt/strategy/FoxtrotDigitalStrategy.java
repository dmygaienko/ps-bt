package com.mygaienko.psbt.strategy;

import java.util.Set;

public class FoxtrotDigitalStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
        return Set.of("Уведомить о наличии");
    }

    @Override
    public String getUrl() {
        return "https://www.foxtrot.com.ua/ru/shop/igrovye_pristavki_sony_sony-ps5.html";
    }

    @Override
    public String getName() {
        return "Foxtrot Digital";
    }

}
