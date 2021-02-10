package com.mygaienko.psbt;


import com.mygaienko.psbt.strategy.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Process {

    private static final Executor executor = Executors.newFixedThreadPool(8);

    private static final List<Strategy> strategies = new ArrayList<>();

    static {
        strategies.add(new RozetkaStrategy());
        strategies.add(new RozetkaDigitalStrategy());
        strategies.add(new AlloStrategy());
        strategies.add(new AlloDigitalStrategy());
        strategies.add(new CitrusStrategy());
        strategies.add(new CitrusDigitalStrategy());
        strategies.add(new FoxtrotStrategy());
        strategies.add(new FoxtrotDigitalStrategy());
//        strategies.add(new ComfyStrategy());
//        strategies.add(new ComfyDigitalStrategy());
    }

    public static void start() {
        System.out.println("Process is starting...");
        strategies.forEach(strategy -> executor.execute(() -> executeStrategy(strategy)));
    }

    public static void executeStrategy(Strategy strategy) {
        while (true) {
            boolean found = Finder.findPs(strategy);
            if (found) {
                Notifier.notify(strategy);
            }
            sleep();
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(1000 * 45);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
