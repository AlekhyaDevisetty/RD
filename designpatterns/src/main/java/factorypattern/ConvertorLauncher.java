package factorypattern;

import java.util.Scanner;

public class ConvertorLauncher {
	public static void main(String args[]) {
		Scanner readObj = new Scanner(System.in);
		System.out.printf("Available conversions:\n"
		                  + "Metertoinch\n"
				          + "Inchtometer \n" + "Inchtofeet \n"
				          + "Feettoinch\n"
				          + "Feettometer\n" + "Metertofeet\n");
		System.out.println("Enter your choice");
		String choice = readObj.next();
        ConvertorFactory factory = new ConvertorFactory();
		Convertor obj = factory.getConversion(choice);
		System.out.println("Enter number");
		double number = readObj.nextDouble();
		System.out.println(obj.convert(number));
	}
}
