package caelum.fj11.modelo;

public class BarraDeProgresso implements Runnable {

    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Barra de progresso");
        }
    }
}
