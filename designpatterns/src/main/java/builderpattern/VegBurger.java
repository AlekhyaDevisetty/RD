package builderpattern;

public class VegBurger extends Burger{

	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 40;
	}

}
