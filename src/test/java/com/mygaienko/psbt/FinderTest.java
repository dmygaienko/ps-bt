package com.mygaienko.psbt;

import com.mygaienko.psbt.strategy.RozetkaStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;


class FinderTest {

    @Test
    void name() {
        assertFalse(Finder.findPs(new RozetkaStrategy()));
    }

}