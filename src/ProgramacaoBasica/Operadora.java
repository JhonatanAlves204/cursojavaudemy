package ProgramacaoBasica;

import java.util.Scanner;

public class Operadora {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double plano = 50.00;
        int minutos;
        double somaplano;

        System.out.println("Digite quantos minutos o Usuario utilizou: ");
        minutos = sc.nextInt();

        if (minutos <= plano) {
            System.out.printf("Usuario contumiu " + minutos + " minutos e sua conta está no Valor de R$ " + "%.2f%n",plano);
        }
            else{
                somaplano = ((minutos - plano) * 2.00) + plano;
                System.out.printf("Usuario contumiu " + minutos + " minutos, por ter ultrapassado os minutos do plano, sua conta está no Valor de R$ " + "%.2f%n",somaplano);
            }
    }
}
