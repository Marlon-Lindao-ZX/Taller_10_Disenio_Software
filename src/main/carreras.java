package main;

import java.util.ArrayList;
import java.util.Random;

public class Carreras{
  public static void main(String[] args) {
    ArrayList <Vehiculo> autos = new ArrayList<>();
    for(int i = 0 ; i< 25 ; i++){
      Vehiculo v = new Vehiculo("Auto_"+i, 
        "serie0"+i, 0,0,0);
      v.setTipo(TipoVehiculo.DEPORTIVO);
      Random r = new Random(); 
      v.colorR = r.nextInt(256);
      v.colorG = r.nextInt(256);
      v.colorB = r.nextInt(256);
      System.out.println(v.name + " (" 
        + v.colorR + "," + v.colorG + "," + 
        v.colorB + ")");
      autos.add(v);
    }
    // Iniciar la carrera
    for (Vehiculo v : autos) {
        v.inicializar();
    }
    //Proceso para identificar quien 
    //gana la carrera
  }
}
