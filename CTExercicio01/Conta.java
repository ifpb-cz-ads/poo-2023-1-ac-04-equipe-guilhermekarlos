package CTExercicio01;

public class Conta {
    private String nomeTitular;
    private String numeroConta;
    private double saldo;
    public void verSaldo(){
        System.out.println("Saldo:" + this.saldo);
    }
    public void sacar(double valor){
        if(this.saldo-valor<0){
            System.out.println("Valor inválido");
        }
        else {
            this.saldo = this.saldo - valor;
        }
    }

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public Conta(String nomeTitular, String numeroConta, double saldo){
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
