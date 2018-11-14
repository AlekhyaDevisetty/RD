package builderpattern;

public abstract class CoolDrink implements Item {

	public Packing packing() {
	    return new Bottle();
	}

	public abstract float price();

}
