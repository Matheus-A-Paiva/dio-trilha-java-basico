public class App {

    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();

        conta.obterDadosDoCliente();
        System.out.println(conta.imprimirDadosDoCliente());
    }
}
