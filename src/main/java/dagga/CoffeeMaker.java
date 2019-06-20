package dagga;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
class CoffeeMaker {
    @Inject Heater heater;
    @Inject Pump pump;

    void brew() {
        System.out.println("Covfefe maker is brewing");
    }
}
