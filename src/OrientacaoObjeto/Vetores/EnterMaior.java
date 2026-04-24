package OrientacaoObjeto.Vetores;

import java.util.Scanner;

public class EnterMaior {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vc vai digitar? ");
        int n = sc.nextInt();

        int [] vect = new int[n];
        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int maior = 0;
        int pos = 0;
        for (int i = 0; i < vect.length; i++){
            if(maior < vect[i]){
                maior = vect[i];
                pos = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + pos);
    }
}
