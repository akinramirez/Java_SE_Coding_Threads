package SimulacionProcesos;

import java.awt.Color;
import javax.swing.JProgressBar;

public class HiloPaint implements Runnable {

  JProgressBar barPaint;
  int i;
  public static boolean finalizado = false;

  public HiloPaint(JProgressBar barPaint) {
    this.barPaint = barPaint;
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
        barPaint.setValue(i);
        Thread.sleep(80);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }    
    barPaint.setForeground(Color.ORANGE);
    System.out.println("Proceso Tal Finalizado");
  }
}
