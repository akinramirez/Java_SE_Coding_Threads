package Practica003Sincronizacion;

import java.util.List;

public class Retirar implements Runnable {

  List<String> dinero;

  public Retirar(List<String> dinero) {
    this.dinero = dinero;
  }

  @Override
  public void run() {
    synchronized (dinero) {
      if (SuperClase.saldo == 0.00) {
        try {
          System.out.println("Hola soy " + Thread.currentThread().getName() + " No hay dinero en el cajero, me espero hasta que depositen");
          dinero.wait();
        } catch (InterruptedException ex) {
          ex.printStackTrace();
        }
      }
      SuperClase.saldo = SuperClase.saldo - 100;
      System.out.println("En este momento " + Thread.currentThread().getName() + " retiro $100");
    }
  }
}
