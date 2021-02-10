package com.mygaienko.psbt;

import com.mygaienko.psbt.strategy.RozetkaDigitalStrategy;
import com.mygaienko.psbt.strategy.RozetkaStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotifierTest {

    @Test
    void testRozetkaStrategy() {
        Notifier.notify(new RozetkaStrategy());
    }

    @Test
    void testRozetkaDigitalStrategy() {
        Notifier.notify(new RozetkaDigitalStrategy());
    }

}