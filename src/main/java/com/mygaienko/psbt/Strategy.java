package com.mygaienko.psbt;

import java.util.Set;

public interface Strategy {

    Set<String> getKeyWords();

    String getUrl();

    String getName();

}
