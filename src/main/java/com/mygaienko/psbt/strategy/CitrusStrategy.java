package com.mygaienko.psbt.strategy;

import java.util.Set;

public class CitrusStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
//        return Set.of("Ожидается");
        return Set.of("\"type\":\"CAN_PREORDER\"");
    }

    @Override
    public String getUrl() {
        return "https://api.citrus.ua/v5/products?ids=663700";
    }

    @Override
    public String getHumanUrl() {
        return "https://www.citrus.ua/igrovye-pristavki/igrovaya-konsol-sony-playstation-5-663700.html";
    }

    @Override
    public String getName() {
        return "Citrus";
    }

}
