package OrientacaoObjeto.Vetores;

import java.util.Scanner;

public class EnterNegativos {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();
        int [] vect = new int[n];

        for(int i = 0; i < vect.length; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for(int i = 0; i < vect.length; i++){
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }
        sc.close();
    }
}
