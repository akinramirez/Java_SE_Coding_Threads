package SimulacionProcesos;

import java.awt.Color;
import javax.swing.JProgressBar;

public class HiloExcel implements Runnable {

  JProgressBar barExcel;
  int i;
  public static boolean finalizado = false;

  public HiloExcel(JProgressBar barExcel) {
    this.barExcel = barExcel;
  }

  @Override
  public void run() {

    for (i = 1; i <= 100; i++) {
      if (finalizado == true) {
        finalizado = false;
        break;
      }
      System.out.println("Proceso " + Thread.currentThread().getName() + " Ejecutandose");
      try {
        barExcel.setValue(i);
        Thread.sleep(40);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
    
    barExcel.setForeground(Color.ORANGE);
    System.out.println("Proceso Tal Finalizado");
  }
}
