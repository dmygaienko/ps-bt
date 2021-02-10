package com.mygaienko.psbt.strategy;

import java.util.Set;

public class AlloStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
        return Set.of("Нет в наличии");
    }

    @Override
    public String getUrl() {
        return "https://allo.ua/ru/igrovye-pristavki/igrovaya-konsol-playstation-5.html";
    }

    @Override
    public String getName() {
        return "Allo";
    }

}
