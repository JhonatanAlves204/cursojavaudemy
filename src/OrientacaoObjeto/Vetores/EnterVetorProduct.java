package OrientacaoObjeto.Vetores;

import OrientacaoObjeto.Vetores.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class EnterVetorProduct {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int x = 0; x < vect.length; x++){
            sum += vect[x].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
    }
}
