package factorypattern;

public class ConvertorFactory {
	public Convertor getConversion(String convertString) {
		if (convertString == null) {
			return null;
		} else if (convertString.equalsIgnoreCase("metertoinch")) {
			return new MetertoInchConvertor();
		} else if (convertString.equalsIgnoreCase("metertofeet")) {
			return new MetertoFeetConvertor();
		} else if (convertString.equalsIgnoreCase("inchtometer")) {
			return new InchtoMeterConvertor();
		} else if (convertString.equalsIgnoreCase("inchtofeet")) {
			return new InchtoFeetConvertor();
		} else if (convertString.equalsIgnoreCase("feettometer")) {
			return new FeettoMeterConvertor();
		} else if (convertString.equalsIgnoreCase("feettoinch")) {
			return new FeettoInchConvertor();
		} else {
			return null;
		}
	}
}
