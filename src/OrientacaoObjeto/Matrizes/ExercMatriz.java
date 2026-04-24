package OrientacaoObjeto.Matrizes;

import java.util.Scanner;

public class ExercMatriz {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da matriz:");
        int n = sc.nextInt();

        int [][] mat = new int[n][n];
        int [] diag = new int [0];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; i++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + ", ");
        }

        System.out.println();
        int neg = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; i++){
                if (mat[i][j] < 0){
                    neg += 1;
                }
            }
        }
        System.out.print("Numeros negativos: " + neg);
        sc.close();
    }
}
