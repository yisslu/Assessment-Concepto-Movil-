package Programa2;

public class CountDown extends Thread {
    public void run() {
        for (int i = 15; i >= 0; i--) {
            System.out.println("Tiempo restante: " + i + " segundos");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cuenta regresiva finalizada.");
        System.exit(0);
    }

    public static void main(String[] args) {
        CountDown time = new CountDown();
        time.start();
    }
}

