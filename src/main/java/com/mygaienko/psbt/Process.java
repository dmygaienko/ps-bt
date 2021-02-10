package com.mygaienko.psbt;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Process {

    private static final Executor executor = Executors.newFixedThreadPool(6);

    private static final List<Strategy> strategies = new ArrayList<>();

    static {
        strategies.add(new RozetkaStrategy());
    }

    public static void start() {
        strategies.forEach(strategy -> executor.execute(() -> executeStrategy(strategy)));
    }

    public static void executeStrategy(Strategy strategy) {
        while (true) {
            boolean found = findPs(strategy);
            if (found) {
                notify(strategy);
            }

            try {
                Thread.sleep(1000 * 15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean findPs(Strategy strategy) {
        return false;
    }

    private static void notify(Strategy strategy) {

    }

}
