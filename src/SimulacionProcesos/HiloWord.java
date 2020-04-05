package SimulacionProcesos;

import java.awt.Color;
import javax.swing.JProgressBar;

public class HiloWord implements Runnable {

  JProgressBar barWord;
  int i;
  public static boolean finalizado = false;

  public HiloWord(JProgressBar barWord) {
    this.barWord = barWord;
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
        barWord.setValue(i);
        Thread.sleep(60);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }    
    barWord.setForeground(Color.ORANGE);
    System.out.println("Proceso Tal Finalizado");
  }
}
