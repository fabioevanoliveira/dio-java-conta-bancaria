import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome completo, por favor:");
        String nomeCompleto = scanner.nextLine();
        // System.out.println("\nO nome do titular é: " + nomeCompleto + "\n");

        System.out.println("Agora digite a agência, por favor:");
        String agencia = scanner.nextLine();
        // System.out.println("\nA agência digitada é: " + agencia + "\n");

        System.out.println("Digite o número da conta, por favor:");
        int numConta = scanner.nextInt();
        // System.out.println("\nO número da conta digitada é: " + numConta + "\n");
        scanner.nextLine(); // Codigo usado para consumir a linha vazia do buffer

        System.out.println("Digite o valor a ser depositado na abertura de conta, por favor:");
        double saldoInicial = scanner.nextDouble();
        // System.out.println("\nSeu saldo atual é de: " + saldoInicial);

        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco! Sua agência é "
                + agencia + ", conta " + numConta + " e seu saldo de R$" + saldoInicial
                + " já está disponível para saque!");

        scanner.close();
    };
};