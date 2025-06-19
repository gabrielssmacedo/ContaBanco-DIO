import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);

        numero = (int)(Math.random()*10000);

        System.out.printf("Bem vindo Usuário %d!\n", numero);
        System.out.print("Por favor, digite sua Agencia: ");
        agencia = sc.next();
        System.out.print("Digite seu nome: ");
        sc.nextLine();
        nomeCliente = sc.nextLine();
        System.out.print("Insira um valor de depósito: ");

        saldo = sc.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco ", nomeCliente);
        System.out.printf("sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", agencia, numero, saldo);

    }
}
