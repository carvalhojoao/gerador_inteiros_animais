public class Cachorro implements Observer {
    @Override
    public void atualizar(int n) {
        System.out.printf("Cachorro: %d\n", n);
    }
    
}
