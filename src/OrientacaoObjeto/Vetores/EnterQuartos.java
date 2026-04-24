package OrientacaoObjeto.Vetores;

import OrientacaoObjeto.Vetores.entities.Quartos;

import java.util.Scanner;

public class EnterQuartos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Quartos[] vect = new Quartos[9];

        System.out.println("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("Room: ");
            int quarto = sc.nextInt();

            vect[quarto] = new Quartos(name, email, quarto);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i].getQuarto() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }
    }
}
