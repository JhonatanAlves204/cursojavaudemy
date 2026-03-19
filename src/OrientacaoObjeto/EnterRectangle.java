package OrientacaoObjeto;

import OrientacaoObjeto.entities.Rectangle;

import java.util.Scanner;
import java.util.Locale;

public class EnterRectangle {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.Diagonal());
    }
}
