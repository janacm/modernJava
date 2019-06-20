package dagga;

import dagger.ObjectGraph;
import javax.inject.Inject;

public class CoffeeApp implements Runnable {
    @Inject
    CoffeeMaker coffeeMaker;

    @Inject Thermosiphon t;

    @Override
    public void run(){
        t.siphonSomething();
        coffeeMaker.brew();
    }

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new DripCoffeeModule());
        CoffeeApp coffeeApp = objectGraph.get(CoffeeApp.class);
        coffeeApp.run();
    }
}
