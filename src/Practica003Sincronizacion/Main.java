package Practica003Sincronizacion;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> dinero = new ArrayList<String>();
    Saldo sal = new Saldo();
    Thread hsal = new Thread(sal);

    Retirar ret = new Retirar(dinero);
    Thread cliente1 = new Thread(ret, "Marco");
    Thread cliente2 = new Thread(ret, "Roberto");
    Thread cliente3 = new Thread(ret, "Javier");
    Thread cliente4 = new Thread(ret, "Jose");
    Thread cliente5 = new Thread(ret, "Maria");
    Thread cliente6 = new Thread(ret, "El Utimo");

    Depositar dep = new Depositar(dinero);
    Thread cajero = new Thread(dep, "Empresas xxx");

    hsal.start();
    cliente1.start();
    cliente2.start();
    cliente3.start();
    cliente4.start();
    cliente5.start();
    cajero.start();
    cliente6.start();
  }
}
