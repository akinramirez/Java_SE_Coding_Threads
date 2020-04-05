package Practica002Runnable;

public class Main {

  public static void main(String[] args) {
    HilosRunnable miHilo = new HilosRunnable();
    Thread proceso1 = new Thread(miHilo, "Word");
    Thread proceso2 = new Thread(miHilo, "Excel");
    Thread proceso3 = new Thread(miHilo, "Power Point");
    Thread proceso4 = new Thread(miHilo, "Login");
    proceso1.start();
    proceso2.start();
    proceso3.start();
    proceso4.start();   
  }
}
