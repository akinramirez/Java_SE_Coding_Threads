package Practica002Runnable;

//Manejo de Hilos implementando la Interfaz Runnable
public class HilosRunnable implements Runnable {

  long ms;

  @Override
  public void run() {
    try {
      ms = (long) (Math.random() * 5 + 1) * 1000;
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    System.out.println("Proceso " + Thread.currentThread().getName() + " Finalizado en " + ms + " milisegundo");
  }

}
