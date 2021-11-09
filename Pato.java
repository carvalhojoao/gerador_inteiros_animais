public class Pato implements Observer{
    @Override
    public void atualizar(int n) {
        System.out.printf("Pato: %d\n", n);
    }
    
}
