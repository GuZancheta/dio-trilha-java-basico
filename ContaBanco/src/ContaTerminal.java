import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o número da agencia: ");
        String agencia = String.valueOf(sc.nextLine());
        System.out.println("Digite o seu nome: ");
        String nomeCliente = String.valueOf(sc.nextLine());
        System.out.println("Digite o saldo: ");
        Double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero
                + " e seu saldo " + saldo
                + " já está disponível para saque!");
    }
}