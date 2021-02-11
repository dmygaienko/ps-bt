package com.mygaienko.psbt.strategy;

import java.util.Set;

public class RozetkaStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
//        return Set.of("Немає в наявності");
//        return Set.of("Повідомити, коли з'явиться");
        return Set.of("\"sell_status\":\"unavailable\"",
                "\"sell_status\":\"out_of_stock\"");
    }

    @Override
    public String getUrl() {
//        return "https://rozetka.com.ua/ua/playstation_5/p223588825/";
        return "https://common-api.rozetka.com.ua/v2/goods/get-price/?id=223588825&r=0.24592114345385507&with_show_in_site=1&lng=ua&lang=ua";
    }

    @Override
    public String getName() {
        return "Rozetka";
    }

}
