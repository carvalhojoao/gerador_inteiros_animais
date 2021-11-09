import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class GeradorAleatorio implements Subject {
    private List<Observer> observers;
    private Random gerador = new Random();
    private int numeroAtual;
    
    public GeradorAleatorio(){
        observers = new ArrayList<>();
    }

    public void registrarObserver(Observer o){
        this.observers.add(o);
    }

    public void removerObserver(Observer o){
        this.observers.remove(o);
    }
    
    public void notificarObservers(){
        for (Observer observer : this.observers) {
            observer.atualizar(numeroAtual);
        }
    }

    public void iniciar(){
        while(true){
            this.numeroAtual = gerador.nextInt(20) + 1;
            notificarObservers();
            System.out.printf("*************\n");
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
