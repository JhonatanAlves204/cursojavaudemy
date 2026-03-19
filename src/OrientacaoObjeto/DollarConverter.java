package OrientacaoObjeto;

import OrientacaoObjeto.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class DollarConverter {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double real;

        System.out.println("What is the dollar price? ");
        double price = CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        real = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n" ,CurrencyConverter.converter(price,real));

    }
}
