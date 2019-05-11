package testes;

import modulos.EstendendoThread;

public class TesteThread {
    public static void main(String[] args) {
        EstendendoThread es1 = new EstendendoThread("Thread # 1");
        EstendendoThread es2 = new EstendendoThread("Thread # 2");
        EstendendoThread es3 = new EstendendoThread("Thread # 3");

        System.err.println("Ativando Threads");

        es1.start();
        es2.start();
        es3.start();

        System.err.println("Threads ativados, main termina\n");
    }
}
