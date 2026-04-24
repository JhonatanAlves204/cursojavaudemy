package OrientacaoObjeto.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main (String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int mediaPar = 0;
        int quantPar = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                mediaPar += vect[i];
                quantPar += 1;
            }
        }
        if(quantPar != 0) {
            System.out.println("MEDIA DOS PARES = " + mediaPar / quantPar);
        }else{
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}

