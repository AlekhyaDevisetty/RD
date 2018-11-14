package factorypattern;

public class FeettoMeterConvertor implements Convertor {
	/**
     * This method converts feet to meters.
     * @param number (in feet).
     * @return number in meters.
     */
    public double convert(final double number) {
       final double value = 0.3048;
       return (number * value);
   }
}
