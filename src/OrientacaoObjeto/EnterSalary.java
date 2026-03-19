package OrientacaoObjeto;

import OrientacaoObjeto.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EnterSalary {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println("Gross salary: ");
        employee.GrossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.println(employee.salaryInicial());

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employee.IncreaseSalary(percentage);


    }
}
