package factorypattern;

public class MetertoInchConvertor implements Convertor {
	/**
     * This method converts meter to inch.
     * @param number (in meters).
     * @return the number in inch.
     */
    public double convert(final double number) {
         final double value = 39.3701;
         return (value  * number);
    }
}
