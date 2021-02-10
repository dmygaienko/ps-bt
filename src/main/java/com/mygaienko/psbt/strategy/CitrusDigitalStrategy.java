package com.mygaienko.psbt.strategy;

import java.util.Set;

public class CitrusDigitalStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
        return Set.of("Ожидается");
    }

    @Override
    public String getUrl() {
        return "https://www.citrus.ua/igrovye-pristavki/igrovaya-konsol-sony-playstation-5-digital-edition-668783.html";
    }

    @Override
    public String getName() {
        return "Citrus Digital";
    }

}
