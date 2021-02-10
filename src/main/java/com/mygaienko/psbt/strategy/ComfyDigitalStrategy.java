package com.mygaienko.psbt.strategy;

import java.util.Set;

public class ComfyDigitalStrategy implements Strategy {

    @Override
    public Set<String> getKeyWords() {
        return Set.of("Попереднє замовлення");
    }

    @Override
    public String getUrl() {
        return "https://comfy.ua/ua/igrovaja-pristavka-sony-playstation-5-digital-edition.html?&partner=google&gclid=Cj0KCQiApY6BBhCsARIsAOI_GjaYJZUQ3IgDHXrEZB0D6qN5_ftS4-u-kK3QFyL4ziSOTzpBXFrtDEAaArCgEALw_wcB&gclsrc=aw.ds";
    }

    @Override
    public String getName() {
        return "Comfy Digital";
    }

}
