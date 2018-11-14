package builderpattern;

public class Pepsi extends CoolDrink{

	public String name() {
		
		return "Pepsi";
	}

	@Override
	public float price() {
		return 20;
	}

}
