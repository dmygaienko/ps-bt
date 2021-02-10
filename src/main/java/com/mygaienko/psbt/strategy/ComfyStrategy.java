package com.mygaienko.psbt.strategy;

import java.util.Set;

public class ComfyStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
        return Set.of("Попереднє замовлення");
    }

    @Override
    public String getUrl() {
        return "https://comfy.ua/ua/igrovaja-pristavka-sony-playstation-5.html?&partner=google&gclid=Cj0KCQiApY6BBhCsARIsAOI_GjZHnGY86Vicbu1PxSddPqCXorHcuZwzhRR3A_IzhFCl7yJ3WXr_UzgaAjFyEALw_wcB&gclsrc=aw.ds";
    }

    @Override
    public String getName() {
        return "Comfy";
    }

}
