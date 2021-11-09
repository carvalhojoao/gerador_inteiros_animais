public class Principal {
    public static void main(String[] args) {
        GeradorAleatorio gerador = new GeradorAleatorio();
        gerador.registrarObserver(new Gato());
        gerador.registrarObserver(new Cachorro());
        gerador.registrarObserver(new Pato());
        gerador.iniciar();
    }
}
