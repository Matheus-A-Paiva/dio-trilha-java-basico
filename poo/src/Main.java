import simulador.iphone.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.ligar("123456789");

        iphone.exibirPagina("youtube.com");
        iphone.atualizarPagina();

        iphone.selecionarMusica("Música favorita");
        iphone.tocar();
        iphone.pausar();

        iphone.atender();


    }
}