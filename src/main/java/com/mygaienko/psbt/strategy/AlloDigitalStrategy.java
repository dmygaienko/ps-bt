package com.mygaienko.psbt.strategy;

import java.util.Set;

public class AlloDigitalStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
        return Set.of("Нет в наличии");
    }

    @Override
    public String getUrl() {
        return "https://allo.ua/ru/igrovye-pristavki/konsol-playstation-5-digital-edition.html";
    }

    @Override
    public String getName() {
        return "Allo Digital";
    }

}
