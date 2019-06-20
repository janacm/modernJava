package dagga;

import javax.inject.Inject;

class Thermosiphon implements Pump{
	private final Heater heater; // this is what the docs have

	@Inject
	Thermosiphon(Heater heater){
		this.heater = heater;
		System.out.println("Thermosiphon constructor called");
	}

	/*
	This constructor doesn't get called since
	there is no @Inject annotation
	 */
	Thermosiphon(Heater heater, String s){
        this.heater = heater;
        System.out.println("Thermosiphon constructor called with string:" +s);
	}

	public void siphonSomething(){
        System.out.println("Siphoning!!!");
    }

}
