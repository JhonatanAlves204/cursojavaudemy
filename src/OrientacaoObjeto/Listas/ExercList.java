package OrientacaoObjeto.Listas;

import OrientacaoObjeto.Listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercList {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Emplyoee #" + i+1 + ":");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();
            Employee emp = new Employee (id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Integer pos = position(list, id);
        if (pos == null) {
            System.out.println("This id does not exist!" );
        }
        else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for(Employee x : list) {
            System.out.println(x.toString());
        }

        /* OUTRO JEITO DE RESOLVER
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!" );
        }
        else{
            System.out.println("Enter the percentage: ");
            emp.increaseSalary(sc.nextDouble());
        }
        System.out.println();
        System.out.println("List of employees: ");
        for(Employee employee : list){
            System.out.println(employee.getId()+ ", " + employee.getName() + ", " + employee.getSalary());
        }
        */

    }

    public static Integer position(List <Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
