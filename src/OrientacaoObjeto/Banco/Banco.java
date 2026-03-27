package OrientacaoObjeto.Banco;

public class Banco {
    private int numConta;
    private String nomeConta;
    private double saldo;

    public Banco(int numConta, String nomeConta, double inicialSaldo){
        this.numConta = numConta;
        this.nomeConta = nomeConta;
        deposit(inicialSaldo);
    }

    public Banco(int numConta, String nomeConta){
        this.numConta = numConta;
        this.nomeConta = nomeConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getnomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double amount){
        saldo += amount;
    }

    public void withdraw(double amount){
        saldo += amount + 5.00;
    }

    public String account(){
        return "Account data:\n"
        + "Account " + getNumConta()
        + ", Holder: " + this.nomeConta
        + ", Balance: $ "
        + String.format("%.2f", getSaldo());
    }
    public String updated(){
        return "Updated account data:\n"
                + "Account " + getNumConta()
                + ", Holder: " + this.nomeConta
                + ", Balance: $ "
                + String.format("%.2f", getSaldo());
    }
}
