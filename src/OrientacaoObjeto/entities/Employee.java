package OrientacaoObjeto.entities;

public class Employee {

    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage){
        double por = (GrossSalary * (percentage / 100))+ NetSalary();

        System.out.println("Updated data: " + name + ", $ " + por);
    }

    public String salaryInicial() {
        return "Employee: "
                + name
                + ", $ "
                + String.format("%.2f", NetSalary());
    }
}
