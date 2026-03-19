package ProgramacaoBasica;

import java.util.Scanner;
import java.util.Locale;

public class Scannear {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        System.out.println(x);


        double a;
        a = sc.nextDouble();

        System.out.printf("%.2f%n",a);

        char b;
        b = sc.next().charAt(0);
        System.out.println(b);


    }
}
