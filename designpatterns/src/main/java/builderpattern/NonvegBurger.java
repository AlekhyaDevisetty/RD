package builderpattern;

public class NonvegBurger extends Burger {

	public String name() {
		return "NonVegBurger";
	}

	@Override
	public float price() {
		return 60;
	}

}
