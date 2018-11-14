package factorypattern;

public class InchtoFeetConvertor implements Convertor{
	  /**
     * This method converts inches to feet.
     * @param number (in inches).
     * @return the number in feet.
     */
    public double convert(final double number) {
        final double value = 0.083333;
        return (number * value);
    }
}
