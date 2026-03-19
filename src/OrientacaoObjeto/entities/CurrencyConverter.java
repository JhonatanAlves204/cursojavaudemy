package OrientacaoObjeto.entities;

public class CurrencyConverter {
    public static double dollarPrice;

    public static double iof (double dollarPrice, double x){
        return 0.06 * (dollarPrice * x);
    }

    public static double converter(double dollarPrice, double x){

        return (dollarPrice * x) + iof(dollarPrice,x);
    }
}
