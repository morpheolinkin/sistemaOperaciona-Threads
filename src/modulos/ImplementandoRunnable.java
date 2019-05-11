package modulos;

/* A classe Runnable não é uma classe que representa uma Thread mas sim uma
* instância execução uma Thread.
* Então quando instaciamnos a Thread temos que passar a instância para o construtor Thread
*
*/
public class ImplementandoRunnable implements Runnable {

    private int sleepTime;
    private String name;

    public ImplementandoRunnable(String name) {
        this.name = name;
        Thread t = new Thread(this);
        t.start();
    }

    public int getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        setSleepTime((int)(Math.random() * 5001));

        for (int i = 0; i < 5; i++){
            System.err.println(getName() + " vai dormir por "
                    + getSleepTime() + " milissegundos");
            try {
                Thread.sleep(getSleepTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.err.println("\n" + getName() + " terminou sua execução!\n");
    }
}
