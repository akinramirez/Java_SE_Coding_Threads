package Practica001Thread;

public class Main {

  public static void main(String[] args) {
    THilo proceso1 = new THilo("Word");
    THilo proceso2 = new THilo("Excel");
    THilo proceso3 = new THilo("Paint");
    THilo proceso4 = new THilo("Reloj");
    THilo proceso5 = new THilo("Video");
    THilo proceso6 = new THilo("Control de Energia");
    proceso1.start();
    proceso2.start();
    proceso3.start();
    proceso4.start();
    proceso5.start();
    proceso6.start();
  }
}
