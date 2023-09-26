package CTExercicio02;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema do banco do povo!");
        System.out.println("Informe seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe o número da conta:");
        String numeroConta = scanner.nextLine();
        System.out.println("Infmorme o valor do saldo inicial");
        double saldo = scanner.nextDouble();
        Conta usuario = new Conta(nome, numeroConta, saldo);
        System.out.println("Usuário " +  usuario.getNomeTitular() + " mecadastrado!");
        System.out.println("Informe o que deseja fazer:");
        System.out.println("1 - Depositar \n" + "2 - Sacar \n" + "3 - Mostrar saldo \n");
        int opcao;
        opcao = scanner.nextInt();
        while (opcao<4 && opcao>0){
            switch (opcao){
                case 1:
                    System.out.println("Informe a quantidade que deseja depositar:");
                    double deposito = scanner.nextDouble();
                    usuario.depositar(deposito);
                    System.out.println("Saldo atualizado:R$" + usuario.getSaldo());
                    break;
                case 2:
                    System.out.println("Informe a quantidade que deseja sacar:");
                    double saque = scanner.nextDouble();
                    boolean retorno = usuario.sacar(saque);
                    if(retorno==true){
                        System.out.println("Operação realizada com sucesso!");
                        System.out.println("Saldo atual:R$" + usuario.getSaldo());
                    }
                    else{
                        System.out.println("Operação inválida, saldo insuficiente!");
                    }
                    break;
                case 3:
                    System.out.println("Saldo:R$" + usuario.getSaldo());
                    break;
                default: throw new IllegalStateException("Opção inválida " + opcao);
            }
            System.out.println("1 - Depositar \n" + "2 - Sacar \n" + "3 - Mostrar saldo \n");
            opcao = scanner.nextInt();
        }

        scanner.close();
    }
}
