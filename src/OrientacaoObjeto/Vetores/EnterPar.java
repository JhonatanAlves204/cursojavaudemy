package OrientacaoObjeto.Vetores;

import java.util.Scanner;

public class EnterPar {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();

        int [] vect = new int [n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int quantityPar = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                System.out.print(vect[i] + " ");
                quantityPar += 1;
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = " + quantityPar);
    }
}
