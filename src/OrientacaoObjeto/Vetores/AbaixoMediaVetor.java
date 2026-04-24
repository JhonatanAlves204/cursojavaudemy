package OrientacaoObjeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMediaVetor {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        double [] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        double media = 0;
        for(int i = 0; i < vect.length; i++){
            media += vect[i];
        }

        System.out.println("MEDIA DO VETOR = " + media / n);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < media/n) {
                System.out.println(vect[i]);
            }
        }


    }
}
