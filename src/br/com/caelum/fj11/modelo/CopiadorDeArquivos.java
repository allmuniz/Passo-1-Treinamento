package caelum.fj11.modelo;

public class CopiadorDeArquivos implements Runnable{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Copiador de Arquivo");
        }
    }
}
