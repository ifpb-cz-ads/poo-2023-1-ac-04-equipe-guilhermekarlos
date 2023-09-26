package CTExercicio01;

public class ContaTeste {
    public static void main(String[] args) {
        Conta francisco = new Conta("Francisco", "123456", 20);
        System.out.println("Meu saldo é de:" + francisco.getSaldo());
        francisco.depositar(10);
        System.out.println("Agora é de:" + francisco.getSaldo());
        francisco.verSaldo();
        francisco.sacar(20);
        francisco.verSaldo();
        francisco.sacar(20);
        francisco.depositar(50);
        francisco.verSaldo();
    }
}
