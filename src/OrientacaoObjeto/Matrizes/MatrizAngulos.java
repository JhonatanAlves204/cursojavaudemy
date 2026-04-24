package OrientacaoObjeto.Matrizes;

import java.util.Scanner;

public class MatrizAngulos {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz: ");
        System.out.println("Quantidade de linhas: ");
        int l = sc.nextInt();
        sc.nextLine();
        System.out.println("Quantidade de colunas: ");
        int c = sc.nextInt();
        sc.nextLine();

        int [][] ma = new int [l][c];
        for (int i = 0; i < ma.length; i++){
            for (int j = 0; j < ma[i].length; j++){
                //System.out.println("Valor da linha [" + i + "] " + " coluna " + "[" + j + "]:");
                ma[i][j] = sc.nextInt();
            }
        }

        System.out.println("Qual numero deseja saber as posiçoes externas? ");
        int n = sc.nextInt();

        for (int i = 0; i < ma.length; i++){
            for (int j = 0; j < ma[i].length; j++){
                if(ma[i][j] == n){
                    System.out.println("Position " + i + "," + j + ":");
                    if(j > 0){
                        System.out.println("Left: " + ma[i][j-1]);
                    }
                    if(j < ma[i].length - 1){
                        System.out.println("Right: " + ma[i][j+1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + ma[i-1][j]);
                    }
                    if(i < ma.length - 1){
                        System.out.println("Down: " + ma[i+1][j]);
                    }
                }
            }
        }
    }
}
