package factorypattern;

public class FeettoInchConvertor implements Convertor {
	/**
     * This method converts feet to inches.
     * @param number (in feet).
     * @return number in Inches.
     */
    public double convert(final double number) {
       final int value = 12;
       return (number * value);
    }
}
