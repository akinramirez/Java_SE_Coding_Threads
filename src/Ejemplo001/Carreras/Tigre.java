package Ejemplo001.Carreras;

public class Tigre extends Thread{
  public void run() {
    int i = 0;
    long ms = 0;
    System.out.println("Comienza el Tigre");
    while (i < 5) {
      try {
        ms = (long) (Math.random() * 5 + 1) * 1000;
        Thread.sleep(ms);
        System.out.println("Tigre corriendo a " + ms + " Metros x segundos");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      i++;
    }
    System.out.println("termina el Tigre");
  }
}
