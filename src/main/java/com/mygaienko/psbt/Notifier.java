package com.mygaienko.psbt;

import com.mygaienko.psbt.strategy.Strategy;

public class Notifier {

    public static void notify(Strategy strategy) {
        System.out.println("Strategy - " + strategy.getName() + " found a PS: go to url and GET it: " + strategy.getHumanUrl());
    }

}
