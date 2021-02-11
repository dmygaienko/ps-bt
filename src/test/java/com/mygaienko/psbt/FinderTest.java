package com.mygaienko.psbt;

import com.mygaienko.psbt.strategy.CitrusStrategy;
import com.mygaienko.psbt.strategy.ComfyDigitalStrategy;
import com.mygaienko.psbt.strategy.ComfyStrategy;
import com.mygaienko.psbt.strategy.RozetkaStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;


class FinderTest {

    @Test
    void findWithRozetkaStrategy() {
        assertFalse(Finder.findPs(new RozetkaStrategy()));
    }

    @Test
    void findWithComfyStrategy() {
        assertFalse(Finder.findPs(new ComfyStrategy()));
    }

    @Test
    void findWithComfyDigitalStrategy() {
        assertFalse(Finder.findPs(new ComfyDigitalStrategy()));
    }

    @Test
    void findWithCitrusStrategy() {
        assertFalse(Finder.findPs(new CitrusStrategy()));
    }

}