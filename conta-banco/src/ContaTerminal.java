import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 * Classe Conta contendo as principais informações de uma conta.
 * @author Matheus Paiva
 * @version 1.0
 * @since 23/08/2024
 */
public class ContaTerminal {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldoConta;

    /**
     * Obtém os dados da conta do cliente via terminal
     * @return void
     */
    public void obterDadosDoCliente(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Digite a agência: ");
        agencia = scanner.next();
        
        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        saldoConta = scanner.nextDouble();

        scanner.close();
    }
    /**
     * @return String retorna a mensagem com os dados obtidos do cliente.
     */
    public String imprimirDadosDoCliente(){
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.";
        return mensagem;
    }

}
