package ProgramacaoBasica;

import java.util.Scanner;

public class MaiorNum {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        //int maior = 0;

        /*for(int i = 0; i < 3; i++){
            if (num1 > num2 && num1 > num3){
                maior = num1;
            }else if (num2 > num1 && num2 > num3){
                maior = num2;
            }else{
                maior = num3;
            }
             System.out.println("O numero Maior é o: " + maior);

        }*/

        int higher = max(num1,num2,num3);

        showResult(higher);

        sc.close();
    }

    public static int max(int x, int y,int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }else if (y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}
