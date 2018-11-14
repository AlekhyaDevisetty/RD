package factorypattern;

public class MetertoFeetConvertor implements Convertor{
	 /**
     * This method converts meters to feet.
     * @param number (in meters.)
     * @return number in feet.
     */
    public double convert(final double number) {
      final double value = 3.28084;
      return (number * value);
    }
}
