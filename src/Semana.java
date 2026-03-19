import java.util.Scanner;

public class Semana {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int opc;
        String dia;

        System.out.println("Digite o numero da Semana: ");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                dia = "Domingo";
                break;

            case 2:
                dia = "Segunda";
                break;

            case 3:
                dia = "Terça";
                break;

            case 4:
                dia = "Quarta";
                break;

            case 5:
                dia = "Quinta";
                break;

            case 6:
                dia = "Sexta";
                break;

            case 7:
                dia = "Sabado";
                break;

            default:
                dia = "Valor Invalido!";
                break;
            }

            System.out.println("Dia da Semana é: " + dia);
        }
}
