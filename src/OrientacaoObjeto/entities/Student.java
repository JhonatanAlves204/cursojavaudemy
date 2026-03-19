package OrientacaoObjeto.entities;

public class Student {
    public String name;
    public double nota1, nota2, nota3;

    public double failed (double a, double b, double c){
        double fa = 60.00 - (a + b + c);
        return fa;
    }

    public double pass (double a, double b, double c){
        return a + b + c;
    }
}
