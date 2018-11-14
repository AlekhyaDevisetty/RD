package factorypattern;

public class InchtoMeterConvertor implements Convertor {
	 /**
     * This method converts inch to meter.
     * @param number (in inches).
     * @return the number in meter.
     */
    public double convert(final double number) {
        final double value = 0.0254;
        return  (number * value);
    }
}
