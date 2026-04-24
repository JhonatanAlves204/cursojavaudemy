package OrientacaoObjeto.Vetores;

import OrientacaoObjeto.Vetores.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class EnterPessoas {
    public static void main (String []args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoas [] vect = new Pessoas[n];
        for (int i = 0; i < n; i++){
            System.out.println("Dados da " + (1 + i) + "a pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

        double soma = 0;
        for (int i = 0; i < n; i++){
            soma += vect[i].getAltura();
        }
        double media = soma / n;
        System.out.printf("Altura média: %.2f",media);

        double menosanos = 0;
        for (int i = 0; i < n; i++){
            if ((vect[i].getIdade() < 16)){
                menosanos ++;
            }
        }
        System.out.println("\nPessoas com menos de 16 anos: " + (menosanos = (menosanos / n) * 100) + "%");

        for (int i = 0; i < n; i++){
            if ((vect[i].getIdade() < 16)){
                System.out.println(vect[i].getNome());
            }
        }

    }
}
