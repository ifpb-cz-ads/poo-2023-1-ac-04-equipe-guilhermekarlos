package CTExercicio02;

public class Conta {
    private String nomeTitular;
    private String numeroConta;
    private double saldo;
    public boolean sacar(double valor){
        if(getSaldo()-valor<0){
            return false;
        }
        else {
            this.saldo = this.saldo-valor;
            return true;
        }
    }
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public Conta(String nomeTitular, String numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
