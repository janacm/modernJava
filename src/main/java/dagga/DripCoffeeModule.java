package dagga;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = CoffeeApp.class
)
class DripCoffeeModule {
    @Provides
    Pump providePump(Thermosiphon pump){
        return pump;
    }

    @Provides
    Heater provideHeater(){
        return new ElectricHeater();
    }
}
