package ProgramacaoBasica;

import java.util.Scanner;

public class NumsWhile {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        int soma = 0;

        while (num != 0) {
            soma += num;
            num = sc.nextInt();
        }
        System.out.println("A soma dos numeros digitados é: " + soma);
        sc.close();
    }
}
