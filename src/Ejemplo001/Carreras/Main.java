package Ejemplo001.Carreras;

public class Main {

  public static void main(String[] args) {
    Liebre HiloLiebre = new Liebre();
    Tortuga HiloTortuga = new Tortuga();
    Thread HT = new Thread(HiloTortuga);
    Tigre HiloTigre = new Tigre();
    HiloLiebre.start();
    HT.start();
    HiloTigre.start();
    System.out.println("Comienza la Carrera!");
  }

}
