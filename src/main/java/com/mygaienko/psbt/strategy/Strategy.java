package com.mygaienko.psbt.strategy;

import java.util.Set;

public interface Strategy {

    Set<String> getKeyWords();

    String getUrl();

    String getName();

    default String getHumanUrl() {
        return getUrl();
    }

}
