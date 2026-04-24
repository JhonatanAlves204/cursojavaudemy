package OrientacaoObjeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.printf("VALORES = ");
        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ",vect[i]);
        }

        double soma = 0;
        for(int i = 0; i < vect.length; i++){
            soma += vect[i];
        }
        System.out.println("\nSOMA = " + soma);

        double media = soma / vect.length;
        System.out.println("MEDIA = " + media);

    }
}
