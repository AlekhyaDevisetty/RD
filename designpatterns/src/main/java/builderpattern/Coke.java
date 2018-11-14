package builderpattern;

public class Coke extends CoolDrink{

	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 25;
	}

}
