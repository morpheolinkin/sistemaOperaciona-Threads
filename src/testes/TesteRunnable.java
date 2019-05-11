package testes;

import modulos.ImplementandoRunnable;

public class TesteRunnable {
    public static void main(String[] args) {
        System.err.println("Ativando Threads");

        ImplementandoRunnable thread1 = new ImplementandoRunnable("Thread # 1");
        ImplementandoRunnable thread2 = new ImplementandoRunnable("Thread # 2");
        ImplementandoRunnable thread3 = new ImplementandoRunnable("Thread # 3");

    }
}
