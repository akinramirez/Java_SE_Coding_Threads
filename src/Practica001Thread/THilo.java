package Practica001Thread;

//Manejo de Hilos heredando de la clase Thread
public class THilo extends Thread {

  private String proceso = "";
  private long ms = 0;

  //Metodo Run encargado de realizar las acciones
  //Va a ir todo lo que queremos que realize el Hilo
  public void run() {

    try {
      ms = (long)(Math.random()*6 + 1)*1000;
      Thread.sleep(ms);
    } catch (Exception ex) {
      System.out.println("Error de Ejecucion");
    }
    System.out.println("Proceso " + proceso + " Finalizado en " + ms + " milisegundo");
  }

  //Constructor
  public THilo(String proceso) {
    this.proceso = proceso;
  }
}
