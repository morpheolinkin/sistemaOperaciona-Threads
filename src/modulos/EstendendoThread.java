package modulos;

public class EstendendoThread extends Thread{
    private int sleepTime;

    public EstendendoThread(String name) {

        super(name);

        //Escolhe um tempo de sono aleatório entre 0 e 5 segundos
        this.sleepTime = (int) (Math.random() * 5001);
    }

    //Método run é o códifo a ser executado pelo novo Thread
    @Override
    public void run() {
        //Ponha Thread para dormir por período de tempo sleepTime
        System.err.println(getName() + " vai dormir por " +
                this.sleepTime + " milissegundos");//Retorna o nome do Thread

        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println(getName() + " terminou de dormir");

    }
}
