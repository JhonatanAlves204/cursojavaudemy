package OrientacaoObjeto;

import OrientacaoObjeto.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class EnterStudent {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("What is the student's name? ");
        student.name = sc.nextLine();

        System.out.println("What are the three grades for the three trimesters of this year?");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        double result = student.nota1 + student.nota2 + student.nota3;

        double failed = student.failed(student.nota1, student.nota2, student.nota3);

        if(result < 60.00 ){
            System.out.printf("FINAL GRANDE = %.2f",result);
            System.out.println("\nFAILED \nMISSING " + failed + " POINTS");
        }else{
            double pass = student.pass(student.nota1, student.nota2, student.nota3);
            System.out.printf("FINAL GRANDE = %.2f",pass);
            System.out.println("\nPASS");
        }

    }
}
