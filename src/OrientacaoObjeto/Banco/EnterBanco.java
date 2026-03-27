package OrientacaoObjeto.Banco;

import java.util.Locale;
import java.util.Scanner;

public class EnterBanco {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Banco banco;

        System.out.println("Enter account number: ");
        int numConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String nomeConta = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            banco = new Banco(numConta, nomeConta, deposit);
        }else{
            banco = new Banco(numConta,nomeConta);
        }

        System.out.println(banco.account());

        System.out.println("Enter a deposit value: ");
        banco.deposit(sc.nextDouble());
        System.out.println(banco.updated());

        System.out.println("Enter a withdraw value: ");
        banco.withdraw(sc.nextDouble());
        System.out.println(banco.updated());

    }
}
