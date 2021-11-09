public class Gato implements Observer{
    @Override
    public void atualizar(int n) {
        System.out.printf("Gato: %d\n", n);
    }
    
}
